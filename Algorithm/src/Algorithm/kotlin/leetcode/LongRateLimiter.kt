package Algorithm.kotlin.leetcode

import java.sql.Time
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class RateLimiter(val maxPermits: Int) {
    var timestamp = System.currentTimeMillis()
    var readLock = ReentrantLock()
    var counter = 0
    val condition = readLock.newCondition()
    val remainsTime = 5000


    fun tryAcquire(): Boolean {
        var remainNanoSeconds = TimeUnit.SECONDS.toNanos(5)
        readLock.withLock {
            while (true) {
                val now = System.currentTimeMillis()
                if (now - timestamp >= remainsTime) {
                    timestamp = now
                    counter = 0
                    condition.signalAll()
                }

                if (counter < maxPermits) {
                    counter++
                    return true
                }

                if (remainNanoSeconds <= 0) {
                    return false
                }

                remainNanoSeconds = condition.awaitNanos(remainNanoSeconds)
            }
        }
    }
}
