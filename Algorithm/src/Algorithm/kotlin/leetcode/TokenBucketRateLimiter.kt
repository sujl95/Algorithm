    package Algorithm.kotlin.leetcode

    import java.util.concurrent.TimeUnit
    import java.util.concurrent.locks.ReentrantLock
    import kotlin.concurrent.withLock

    class TokenBucketRateLimiter {

        private val maxTokens = 5.0

        private var availableTokens = 5.0

        private val refillRateMs = 0.000001

        private var lastRefillTimestamp = System.nanoTime()

        private val lock = ReentrantLock()

        private val condition = lock.newCondition()


        fun tryAcquire(): Boolean {
            var remainingNanoSeconds = TimeUnit.SECONDS.toNanos(5)

            lock.withLock {
                while(true) {
                    val now = System.nanoTime()
                    val elapsedNanos = now - lastRefillTimestamp

                    if (elapsedNanos > 0) {
                        availableTokens = minOf(maxTokens, availableTokens + elapsedNanos * refillRateMs)
                        lastRefillTimestamp = now
                        condition.signalAll()
                    }

                    if (availableTokens >= 1.0) {
                        availableTokens -= 1.0
                        return true
                    }

                    if (remainingNanoSeconds <= 0) {
                        return false
                    }

                    val startWait = System.nanoTime()
                    remainingNanoSeconds = condition.awaitNanos(remainingNanoSeconds)
                    val actualWait = System.nanoTime() - startWait

                    remainingNanoSeconds -= actualWait
                }
            }

        }

    }

