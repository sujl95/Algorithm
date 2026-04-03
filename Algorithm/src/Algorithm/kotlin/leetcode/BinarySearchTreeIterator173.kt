package Algorithm.kotlin.leetcode

class BinarySearchTreeIterator173 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class BSTIterator(root: TreeNode?) {
        val stack = ArrayDeque<TreeNode>()

        init {
            var current = root
            while (current != null) {
                stack.addLast(current)
                current = current.left
            }
        }

        fun next(): Int {
            val node = stack.removeLast()
            var current = node.right
            while (current != null) {
                stack.addLast(current)
                current = current.left
            }
            return node.`val`
        }

        fun hasNext(): Boolean {
            return stack.isNotEmpty()
        }
    }
}

data class Student(
    val name: String,
    val korean: Int,
    val math: Int,
    val english: Int,
) {
    fun total(): Int {
        return korean + math + english
    }
}



class GradeSystem {
    val comparator = compareByDescending<Student> { it.total() }
        .thenByDescending { it.korean }
        .thenByDescending { it.math }
        .thenByDescending { it.english }
        .thenBy { it.name }

    val map = mutableMapOf<String, Student>()

    fun input(student: Student) {
        map[student.name] = student
    }

    fun delete(name: String) {
        map.remove(name)
    }

    fun read(): String {
        val sb = StringBuilder()
        sb.append("이름 국어 수학 영어\n")
        sb.append("--------------\n\n")
        if (map.size > 0) {
            map.values.sortedWith(comparator).forEach {
                sb.append("${it.name} ${it.korean} ${it.math} ${it.english}\n")
            }
        }
        """
            
        """.trimMargin()
        return sb.toString()
    }
}
