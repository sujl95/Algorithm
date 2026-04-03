package Algorithm.kotlin.leetcode

import java.util.TreeMap


class DesignInMemoryFileSystem588 {
    data class Node(
        var isFile: Boolean = false,
        val children: TreeMap<String, Node> = TreeMap(), // 자동 사전순 정렬
        var content: String = ""
    )

    class FileSystem {
        private var root = Node()
        fun ls(path: String): List<String> {
            var current = root
            path.split("/").filter { it.isNotEmpty() }.forEach {
                current = current.children[it] ?: return emptyList()
            }
            if (current.isFile) {
                return listOf(path.substringAfterLast("/"))
            }
            return current.children.keys.toList()
        }

        fun mkdir(path: String) {
            var current = root
            path.split("/").filter { it.isNotEmpty() }.forEach { name ->
                current = current.children.computeIfAbsent(name) { Node() }
            }
        }

        fun addContentToFile(filePath: String, content: String) {
            var current = root
            filePath.split("/").filter { it.isNotEmpty() }.forEach {
                current = current.children.computeIfAbsent(it) { Node() }
            }
            current.content += content
            current.isFile = true
        }

        fun readContentFromFile(filePath: String): String {
            var current = root
            filePath.split("/").filter { it.isNotEmpty() }.forEach {
                current = current.children[it]!!
            }
            return current.content
        }

        fun rm(path: String) {
            var current = root
            val parts = path.split("/").filter { it.isNotEmpty() }
            parts.forEachIndexed { i, value ->
                if (i == parts.size - 1) {
                    current.children.remove(value)
                } else {
                    current = current.children[value]!!
                }
            }
        }

        fun tree(path: String): List<String> {
            val result = mutableListOf<String>()
            var current = root
            path.split("/").filter { it.isNotEmpty() }.forEach {
                current = current.children[it] ?: return emptyList()
            }
            current.children.forEach { entry ->
                traverse(entry.key, entry.value, 0, result)
            }

            return result
        }

        private fun traverse(name: String, node: Node, depth: Int, result: MutableList<String>) {
            result.add("  ".repeat(depth) + name)
            node.children.forEach { entry ->
                traverse(entry.key, entry.value, depth + 1, result)
            }
        }
    }
}

fun main() {
    val fs = DesignInMemoryFileSystem588.FileSystem()

//// 기본 케이스
//    fs.mkdir("/a/b/c")
//    fs.addContentToFile("/a/b/file.txt", "hello")
//    println(fs.ls("/a/b"))                        // [c, file.txt]
//    println(fs.ls("/a/b/file.txt"))               // [file.txt]
//    println(fs.readContentFromFile("/a/b/file.txt")) // hello
//
//// append 케이스
//    fs.addContentToFile("/a/b/file.txt", " world")
//    println(fs.readContentFromFile("/a/b/file.txt")) // hello world
//
//// ls 루트
//    fs.mkdir("/x/y")
//    println(fs.ls("/"))                           // [a, x]
//
//// 사전순 정렬 확인
//    fs.mkdir("/a/z")
//    println(fs.ls("/a"))                          // [b, z]

    fs.mkdir("/a/b/c")
    fs.mkdir("/a/z")
    fs.addContentToFile("/a/b/file.txt", "hello")

    println(fs.tree("/"))
// [a,   b,     c,     file.txt,   z]

    println(fs.tree("/a"))
// [b,   c,   file.txt, z]

    println(fs.tree("/a/b"))
// [c, file.txt]

}
