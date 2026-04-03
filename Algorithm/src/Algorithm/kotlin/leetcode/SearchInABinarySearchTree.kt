package Algorithm.kotlin.leetcode


class SearchInABinarySearchTree {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class Solution {
        fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
            if (root == null) {
                return null
            }

            if (root.`val` == `val`) {
                return root
            }

            val left = searchBST(root.left, `val`)
            val right = searchBST(root.right, `val`)

            if (left != null) {
                return left
            } else if (right != null) {
                return right
            } else {
                return null
            }
        }
    }
}

fun main() {
    val solution = SearchInABinarySearchTree.Solution()

    // 테스트 1
    val root1 = SearchInABinarySearchTree.TreeNode(4).apply {
        left = SearchInABinarySearchTree.TreeNode(2).apply {
            left = SearchInABinarySearchTree.TreeNode(1)
            right = SearchInABinarySearchTree.TreeNode(3)
        }
        right = SearchInABinarySearchTree.TreeNode(7)
    }
    println("Test 1: ${solution.searchBST(root1, 2)?.`val`}") // 기대값: 2

    // 테스트 2
    val root2 = SearchInABinarySearchTree.TreeNode(4).apply {
        left = SearchInABinarySearchTree.TreeNode(2).apply {
            left = SearchInABinarySearchTree.TreeNode(1)
            right = SearchInABinarySearchTree.TreeNode(3)
        }
        right = SearchInABinarySearchTree.TreeNode(7)
    }
    println("Test 2: ${solution.searchBST(root2, 5)?.`val`}") // 기대값: null
}


