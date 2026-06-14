package Algorithm.kotlin.leetcode

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.withLock

class LRUCacheTest(val cap: Int) {
    val dq = ArrayDeque<Int>()
    val map = ConcurrentHashMap<Int, Int>()
    val lock = ReentrantReadWriteLock()
    val readLock = lock.readLock()
    val writeLock = lock.writeLock()

    fun get(key: Int): Int {
        writeLock.withLock {
            val value = map[key] ?: return -1
            dq.remove(key)
            dq.addFirst(key)
            return value
        }
    }

    fun put(key: Int, value: Int) {
        writeLock.withLock {
            map[key] = value
            dq.remove(key)
            dq.addFirst(key)
            while (dq.size > cap) {
                dq.removeLastOrNull()?.let {
                    map.remove(it)
                }
            }
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
