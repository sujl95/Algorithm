package Algorithm.kotlin.leetcode

import kotlin.math.max

private class LongestPalindromicSubstring5 {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        val n = s.length
        var start = 0
        var end = 0
        for (i in 0 until n) {
            // 홀수
            var left1 = i
            var right1 = i
            while (left1 >= 0 && right1 < n && s[left1] == s[right1]) {
                left1--
                right1++
            }
            val result1 = right1 - left1 - 1
            // 수

            var left2 = i
            var right2 = i + 1
            while (left2 >= 0 && right2 < n && s[left2] == s[right2]) {
                left2--
                right2++
            }
            val result2 = right2 - left2 - 1

            val maxLength = max(result1, result2)
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2
                end = i + maxLength / 2
            }
        }
        return s.substring(start, end + 1)
    }
}

fun main() {
    val solution = LongestPalindromicSubstring5()
    println(solution.longestPalindrome("babad")) // "aba" or "bab"
    println(solution.longestPalindrome("cbbd")) // "bb"
     println(solution.longestPalindrome("a")) // "a"
     println(solution.longestPalindrome("ac")) // "a" or "c"
     println(solution.longestPalindrome("abccbd")) // "bccb"
     println(solution.longestPalindrome("ababa")) // "ababa"
}
