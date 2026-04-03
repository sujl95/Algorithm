package Algorithm.kotlin.leetcode

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.size == 1) {
            return listOf(strs.toList())
        }
        val map = mutableMapOf<String, MutableList<String>>()

        strs.forEach {  str ->
            val sortedArray = str.split("").sorted()
            val key = sortedArray.toString()
            val value = map[key]
            if (value == null) {
                map[key] = mutableListOf(str)
            } else {
                value.add(str)
            }
        }

        return map.values.toList().sortedBy { it.size }
    }
}

fun main() {
    val solution = Solution()
    println(solution.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
    println(solution.groupAnagrams(arrayOf("")))
    println(solution.groupAnagrams(arrayOf("a")))
}


