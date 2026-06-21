package Algorithm.kotlin.leetcode

private class FindAllAnagramsInAString438 {
    fun findAnagrams(s: String, p: String): List<Int> {
        val map = mutableMapOf<Char, Int>()
        val resultIndex = mutableListOf<Int>()
        for (i in 0 until p.length) {
            val char = p[i]
            val value = map[char] ?: 0
            map[char] = value + 1
        }
        for (i in 0 until s.length) {
            val mapCopy = mutableMapOf<Char, Int>()
            map.entries.forEach {
                mapCopy[it.key] = it.value
            }
            val end = i + p.length - 1
            if (end > s.length - 1) {
                continue
            }
            var isAnagram = false
            val sub = s.substring(i, end + 1)
            for (j in 0 until sub.length ) {
                val subChar = sub[j]
                val subValue = mapCopy[subChar]
                val value = subValue ?: break
                if (subValue == 0) {
                    break
                }
                mapCopy[subChar] = value - 1

                if (j == sub.length - 1) {
                    isAnagram = true
                }
            }

            if (isAnagram) {
                resultIndex.add(i)
            }
        }

        return resultIndex
    }

    fun findSlidingAnagrams(s: String, p: String): List<Int> {
        val resultIndex = mutableListOf<Int>()
        if (s.length < p.length) {
            return resultIndex
        }

        val pCount = IntArray(26)
        val sCount = IntArray(26)

        for (i in p.indices) {
            pCount[p[i] - 'a']++
            sCount[s[i] - 'a']++
        }

        if (pCount.contentEquals(sCount)) {
            resultIndex.add(0)
        }

        for (i in p.length until s.length) {
            sCount[s[i] - 'a']++
            sCount[s[i - p.length] - 'a']--

            if (pCount.contentEquals(sCount)) {
                resultIndex.add(i - p.length + 1)
            }
        }
        return resultIndex
    }
}

fun main() {
    val solution = FindAllAnagramsInAString438()
    println(solution.findAnagrams("beeaaedcbc", "c"))
    println(solution.findAnagrams("cbaebabacd", "abc"))
    println(solution.findAnagrams("abab", "ab"))
}
