package Algorithm.kotlin.leetcode

private class LRUCache1 {
    private class LRUCache(val capacity: Int) {
        val arrayDeque = ArrayDeque<Int>()
        val map = mutableMapOf<Int, Int>()

        fun get(key: Int): Int {
            val value = map[key] ?: return -1
            arrayDeque.remove(key)
            arrayDeque.addFirst(key)
            return value
        }

        fun put(key: Int, value: Int) {
            arrayDeque.remove(key)
            arrayDeque.addFirst(key)
            map[key] = value
            while (map.size > capacity) {
                val removeFirst = arrayDeque.removeLast()
                map.remove(removeFirst)
            }
        }
    }
}

private class LRUCache2 {
    class LRUCache(val capacity: Int) {
        class Node(val key: Int, var value: Int) {
            var prev: Node? = null
            var next: Node? = null
        }

        val map = mutableMapOf<Int, Node>()
        val head = Node(0, 0)
        val tail = Node(0, 0)

        init {
            head.next = tail
            tail.prev = head
        }


        fun get(key: Int): Int {
            val node = map[key] ?: return -1
            moveToHead(node)
            return node.value
        }

        fun put(key: Int, value: Int) {
            val node = map[key]
            if (node != null) {
                node.value = value
                moveToHead(node)
            } else {
                if (map.size >= capacity) {
                    val lru = tail.prev!!
                    remove(lru)
                    map.remove(lru.key)
                }
                val newNode = Node(key, value)
                addFirst(newNode)
                map[key] = newNode
            }
        }

        fun moveToHead(node: Node) {
            remove(node)
            addFirst(node)
        }

        fun addFirst(node: Node) {
            node.next = head.next
            node.next?.prev = node
            head.next = node
            node.prev = head
        }

        fun remove(node: Node) {
            node.prev?.next = node.next
            node.next?.prev = node.prev
        }

    }
}

private class LRUCache3 {
    class LRUCache(val capacity: Int) {
        private val map = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
            override fun removeEldestEntry(eldest: Map.Entry<Int, Int>): Boolean {
                return this.size > capacity
            }
        }

        fun put(key: Int, value: Int) {
            map[key] = value
        }

        fun get(key: Int): Int {
            return map[key] ?: return -1
        }
    }
}
