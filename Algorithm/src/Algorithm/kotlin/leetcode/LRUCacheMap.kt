package Algorithm.kotlin.leetcode

import java.util.*
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.*

private class LRUCacheMap(val capacity: Int) {
    private val map = object: LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: Map.Entry<Int, Int>): Boolean {
            return this.size > capacity
        }
    }

    private val lock = ReentrantReadWriteLock()
    private val writeLock = lock.writeLock()


    fun put(key: Int, value: Int) {
        if (capacity <= 0) {
            return
        }
        writeLock.withLock {
            map[key] = value
        }
    }

    fun get(key: Int): Int {
        if (capacity <= 0) {
            return -1
        }
        writeLock.withLock {
            return map[key] ?: -1
        }
    }
}
