    package Algorithm.kotlin.leetcode

    import java.util.concurrent.TimeUnit
    import java.util.concurrent.locks.ReentrantLock
    import kotlin.concurrent.withLock

    class TokenBucketRateLimiter {

        private val maxTokens = 5.0

        private var availableTokens = 5.0

        private val refillRateMs = 0.001 // 1ms당 0.001개 (1초에 1개)

        private var lastRefillTimestamp = System.currentTimeMillis()

        private val lock = ReentrantLock()

        private val condition = lock.newCondition()


        fun tryAcquire(): Boolean {
            var remainingNanoSeconds = TimeUnit.SECONDS.toNanos(5)

            lock.withLock {
                while(true) {
                    val now = System.currentTimeMillis()
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

                    remainingNanoSeconds = condition.awaitNanos(remainingNanoSeconds)
                }
            }

        }

    }

