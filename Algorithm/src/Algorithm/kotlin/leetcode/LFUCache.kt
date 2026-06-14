package Algorithm.kotlin.leetcode

import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.withLock

// https://leetcode.com/problems/lfu-cache/description/

private class LFUCache(val capacity: Int) {
    private val vals = HashMap<Int, Int>()
    private val counts = HashMap<Int, Int>()
    private val lists = HashMap<Int, LinkedHashSet<Int>>()

    private var min = -1
    private val lock = ReentrantReadWriteLock()
    private val writeLock = lock.writeLock()

    fun get(key: Int): Int {
        if (capacity <= 0) {
            return -1
        }

        writeLock.withLock {
            if (vals.containsKey(key).not()) {
                return -1
            }

            val count = counts[key]!!
            counts[key] = count + 1

            lists[count]!!.remove(key)

            if (count == min && lists[count]?.size == 0) {
                min++
            }

            lists.computeIfAbsent(count + 1) { LinkedHashSet() }.add(key)
            return vals[key]!!
        }
    }

    fun put(key: Int, value: Int) {
        if (capacity <= 0) {
            return
        }
        writeLock.withLock {
            if (vals.containsKey(key)) {
                vals[key] = value
                get(key)
                return
            }

            if (vals.size >= capacity) {
                val evict = lists[min]!!.first()
                lists[min]?.remove(evict)
                vals.remove(evict)
                counts.remove(evict)
            }

            vals[key] = value
            counts[key] = 1
            min = 1
            lists.computeIfAbsent(1) { LinkedHashSet() }.add(key)
        }
    }
}
