package Algorithm.kotlin.leetcode

// https://leetcode.com/problems/implement-trie-prefix-tree/description/

class ImplementTriePrefixTree208 {
    class TrieNode {
        val children = mutableMapOf<Char, TrieNode>()
        var isEndOfWord = false
    }

    class Trie {
        private val root = TrieNode()

        fun insert(word: String) {
            var node = root
            word.forEach {
                if (node.children[it] == null) {
                    node.children[it] = TrieNode()
                }
                node = node.children[it]!!
            }
            node.isEndOfWord = true
        }


        fun search(word: String): Boolean {
            var node = root
            word.forEach {
                if (node.children[it] == null) {
                    return false
                }
                node = node.children[it]!!
            }
            return node.isEndOfWord
        }

        fun startsWith(prefix: String): Boolean {
            var node = root
            prefix.forEach {
                if (node.children[it] == null) {
                    return false
                }
                node = node.children[it]!!
            }
            return true
        }
    }
}

fun main() {
    val trie = ImplementTriePrefixTree208.Trie()
    trie.insert("apple")
    println(trie.search("apple")) // true
    println(trie.search("app")) // false
    println(trie.startsWith("app")) // true
    trie.insert("app")
    println(trie.search("app")) // true
}
