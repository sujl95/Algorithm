package Algorithm.kotlin.leetcode

import java.util.Collections
import java.util.PriorityQueue

class LastStoneWeight1046 {
    class Solution {
        private val priorityQueue = PriorityQueue(Collections.reverseOrder<Int>())

        fun lastStoneWeight(stones: IntArray): Int {
            stones.forEach {
                priorityQueue.add(it)
            }
            if (stones.size == 2) {
                val first = priorityQueue.poll()
                val second = priorityQueue.poll()
                val result = first - second
                return result
            }
            while (priorityQueue.size >= 2) {
                val first = priorityQueue.poll()
                val second = priorityQueue.poll()
                val result = first - second
                priorityQueue.add(result)
            }

            return priorityQueue.peek()
        }
    }
}

fun main() {
    val solution = LastStoneWeight1046.Solution()
    println(solution.lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1))) // 1
     println(solution.lastStoneWeight(intArrayOf(1))) // 1
     println(solution.lastStoneWeight(intArrayOf(1, 3)) )// 2
     println(solution.lastStoneWeight(intArrayOf(1, 1)) )// 0
}
