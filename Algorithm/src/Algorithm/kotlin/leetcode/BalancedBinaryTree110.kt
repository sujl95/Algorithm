package Algorithm.kotlin.leetcode

import kotlin.math.abs


private class BalancedBinaryTree110 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun isBalanced(root: TreeNode?): Boolean {
        return checkHeight(root) != -1
    }

    fun checkHeight(root: TreeNode?): Int {
        if (root == null) return 0
        val leftHeight = checkHeight(root.left)
        if (leftHeight == -1) return -1
        val rightHeight = checkHeight(root.right)
        if (rightHeight == -1) return -1

        if (abs(leftHeight - rightHeight) > 1) {
            return -1
        }
        return maxOf(leftHeight, rightHeight) + 1
    }
}
