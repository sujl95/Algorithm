package Algorithm.kotlin.leetcode

class LRUCache(val capacity: Int) {
    val arrayDeque = ArrayDeque<Int>()
    val map = mutableMapOf<Int, Int>()

    fun get(key: Int): Int {
        val result = map[key] ?: return -1
        arrayDeque.remove(key)
        arrayDeque.addFirst(key)
        return result
    }

    fun put(key: Int, value: Int) {
        map[key] = value
        arrayDeque.remove(key)
        arrayDeque.addFirst(key)
        while (arrayDeque.size > capacity) {
            val last = arrayDeque.removeLast()
            map.remove(last)
        }
    }
}

fun main() {
    val lRUCache = LRUCache(2)
    lRUCache.put(1, 1) // cache is {1=1}
    lRUCache.put(2, 2) // cache is {1=1, 2=2}
    println(lRUCache.get(1)) // return 1
    lRUCache.put(3, 3) // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    println(lRUCache.get(2)) // returns -1 (not found)
    lRUCache.put(4, 4) // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    println(lRUCache.get(1)) // return -1 (not found)
    println(lRUCache.get(3)) // return 3
    println(lRUCache.get(4)) // return 4
}
