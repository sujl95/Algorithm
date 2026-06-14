package Algorithm.kotlin.leetcode

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.withLock

private class LRUCacheCustom(
    private val cap: Int,
) {
    private class Node(var key: Int = 0, var value: Int = 0) {
        var prev: Node? = null
        var next: Node? = null
    }

    private val lock = ReentrantReadWriteLock()
    private val readLock = lock.readLock()
    private val writeLock = lock.writeLock()
    private val map = ConcurrentHashMap<Int, Node>()
    private var head: Node = Node(key = 0, value = 0)
    private var tail: Node = Node(key = 0, value = 0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int {
        writeLock.withLock {
            val node = map[key] ?: return -1
            moveToHead(node)
            return node.value
        }
    }

    fun put(key: Int, value: Int) {
        writeLock.withLock {
            val node = map[key]
            if (node != null) {
                node.value = value
                moveToHead(node)
            } else {
                if (map.size >= cap) {
                    val node = tail.prev!!
                    removeNode(node)
                    map.remove(node.key)
                }

                val newNode = Node(key, value)
                addNode(newNode)
                map[key] = newNode
            }
        }
    }

    private fun moveToHead(node: Node) {
        removeNode(node)
        addNode(node)
    }

    private fun removeNode(node: Node) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    private fun addNode(node: Node) {
        node.next = head.next
        node.next?.prev = node
        head.next = node
        node.prev = head
    }
}
