package Algorithm.kotlin.leetcode


// https://leetcode.com/problems/top-k-frequent-elements/

class TopKFrequent {

    class Solution {
        fun topKFrequent(nums: IntArray, k: Int): IntArray {
            val map = mutableMapOf<Int, Int>()
            nums.forEach { num ->
                val value = map[num]
                if (value == null) {
                    map[num] = 1
                } else {
                    map[num] = value + 1
                }
            }
            return map.entries.sortedBy { it.value }.takeLast(k).map { it.key }.toIntArray()
        }
    }
}
