package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/min-stack

class MinStack155 {
    class MinStack {
        val stack = ArrayDeque<Int>()
        val minStack = ArrayDeque<Int>()

        fun push(`val`: Int) {
            stack.addLast(`val`)
            if (minStack.isEmpty() || `val` <= minStack.last()) {
               minStack.addLast(`val`)
            }
        }

        fun pop() {
            if (stack.isEmpty()) {
                return
            }
            val last = stack.removeLast()
            if (last == minStack.last()) {
                minStack.removeLast()
            }
        }

        fun top(): Int {
            stack.lastOrNull()?.let {
                return it
            }
            return -1
        }

        fun getMin(): Int {
            minStack.lastOrNull()?.let {
                return it
            }
            return -1
        }
    }
}
