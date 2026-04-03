package Algorithm.kotlin.leetcode

import java.util.PriorityQueue

class KthLargest(val k: Int, val nums: IntArray) {
    val priorityQueue = PriorityQueue<Int>()
    init {
        nums.forEach {
            add(it)
        }
    }

    fun add(`val`: Int): Int {
        priorityQueue.add(`val`)
        if (priorityQueue.size > k) {
            priorityQueue.poll()
        }
        return priorityQueue.peek()
    }
}

