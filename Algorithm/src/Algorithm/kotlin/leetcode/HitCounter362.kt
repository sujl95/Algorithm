package Algorithm.kotlin.leetcode

private class HitCounterQueue() {
    // 1. 필요한 자료구조 선언
    val dq = ArrayDeque<Int>()

    // 2. 클릭이 발생했을 때 호출 (timestamp는 초 단위)
    fun hit(timestamp: Int) {
        dq.add(timestamp)
    }

    // 3. 현재 timestamp 기준, '과거 5분(300초)' 동안 발생한 총 hit 수를 리턴
    // 즉, [timestamp - 299, timestamp] 범위의 hit 개수 합산
    fun getHits(timestamp: Int): Int {
        while(dq.isNotEmpty() && dq.firstOrNull() != null && (dq.first() < (timestamp - 299))) {
            dq.removeFirst()
        }
        return dq.size
    }
}

private class HitCounterArray() {
    val times = IntArray(300) { 0 }
    val hits = IntArray(300) { 0 }

    fun hit(timestamp: Int) {
        val index = timestamp % 300
        if (times[index] != timestamp) {
            times[index] = timestamp
            hits[index] = 1
        } else {
            hits[index]++
        }
    }


    fun getHits(timestamp: Int): Int {
        var total = 0
        for (i in 0 until 300) {
            if (timestamp - times[i] < 300) {
                total += hits[i]
            }
        }
        return total
    }
}
