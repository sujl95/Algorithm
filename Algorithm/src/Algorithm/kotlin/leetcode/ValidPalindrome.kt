package Algorithm.kotlin.leetcode

class ValidPalindrome {
    class Solution {
        fun isPalindrome(s: String): Boolean {
            val alphabet = "zxcvbnmadsfghjklqwertyuiop0123456789"
            val s = s.lowercase()
            val filteredStr = s.filter { alphabet.contains(it) }
            val length = filteredStr.length
            val (pos, pos1) = if (length % 2 == 0) {
                val divide = filteredStr.length / 2
                divide - 1 to divide
            } else {
                val divide = filteredStr.length / 2
                divide - 1 to divide + 1
            }

            val part = filteredStr.substring(0, pos + 1)

            val part1 = filteredStr.substring(pos1, filteredStr.length).reversed()

            if (length == 1 && s.length == length) {
                return true
            }

            if (length == 1 ) {
                return true
            }

            return part == part1
        }
    }
}

fun main() {
    val s = "A man, a plan, a canal: Panama"
    println(ValidPalindrome.Solution().isPalindrome(s)) // true
    val s2 = "race a car"
    println(ValidPalindrome.Solution().isPalindrome(s2)) // false
    val s3 = "a."
    println(ValidPalindrome.Solution().isPalindrome(s3)) // true
}
