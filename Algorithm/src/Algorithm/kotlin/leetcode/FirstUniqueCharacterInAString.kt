package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/first-unique-character-in-a-string/

class FirstUniqueCharacterInAString {
    fun firstUniqChar(s: String): Int {
        val arrays = s.split("").map { it.trim() }.filter { it.isNotEmpty() }
        if (arrays.size == 1) {
            return 0
        }
        val duplicate = mutableSetOf<String>()
        var result = -1
        for (i in arrays.indices) {
            val start = arrays[i]
            if (duplicate.contains(start)) {
                continue
            }
            for (j in i + 1 until arrays.size) {
                val end = arrays[j]
                if (start == end) {
                    result = -1
                    duplicate.add(start)
                    break
                } else if (j == arrays.size -1) {
                    return i
                }
            }
            if (i == arrays.size - 1) {
                return i
            }
        }
        return result
    }
}

class FirstUniqueCharacterInAString1 {

    fun firstUniqChar(s: String): Int {
        val arrays = s.split("").map { it.trim() }.filter { it.isNotEmpty() }
        if (arrays.size == 1) {
            return 0
        }
        val map = mutableMapOf<Char, Int>()
        for (i in arrays.indices) {
            val start = arrays[i][0]
            map[start] = map.getOrDefault(start, 0) + 1
        }
        return map.entries.filter { it.value == 1 }.map { it.key }.firstOrNull()?.let { s.indexOf(it) } ?: -1
    }
}

fun main() {
//    val s = "leetcode"
//    println(FirstUniqueCharacterInAString().firstUniqChar(s)) // 0
//        val s2 = "loveleetcode"
//    println(FirstUniqueCharacterInAString().firstUniqChar(s2)) // 2
//        val s3 = "aabb"
//    println(FirstUniqueCharacterInAString().firstUniqChar(s3)) // -1
    val s4 = "dddccdbba"
    println(FirstUniqueCharacterInAString().firstUniqChar(s4)) // 8
}
