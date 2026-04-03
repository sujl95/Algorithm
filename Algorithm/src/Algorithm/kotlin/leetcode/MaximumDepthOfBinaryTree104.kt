package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/maximum-depth-of-binary-tree

class MaximumDepthOfBinaryTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)

        return maxOf(leftDepth, rightDepth) + 1
    }
}

fun main() {
    val solution = MaximumDepthOfBinaryTree()

    // 테스트 1
    val root1 = MaximumDepthOfBinaryTree.TreeNode(3).apply {
        left = MaximumDepthOfBinaryTree.TreeNode(9)
        right = MaximumDepthOfBinaryTree.TreeNode(20).apply {
            left = MaximumDepthOfBinaryTree.TreeNode(15)
            right = MaximumDepthOfBinaryTree.TreeNode(7)
        }
    }
    println("Test 1: ${solution.maxDepth(root1)}") // 기대값: 3

    // 테스트 2
    val root2 = MaximumDepthOfBinaryTree.TreeNode(1).apply {
        right = MaximumDepthOfBinaryTree.TreeNode(2)
    }
    println("Test 2: ${solution.maxDepth(root2)}") // 기대값: 2

    // 테스트 3: 빈 트리
    println("Test 3: ${solution.maxDepth(null)}") // 기대값: 0

     // 테스트 4: 단일 노드
    val root4 = MaximumDepthOfBinaryTree.TreeNode(1)
    println("Test 4: ${solution.maxDepth(root4)}") // 기대값: 1
}
