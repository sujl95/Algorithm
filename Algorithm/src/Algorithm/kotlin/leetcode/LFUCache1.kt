package Algorithm.kotlin.leetcode

private class LFUCache1 {
    class LFUCache(val capacity: Int) {
        val counts = mutableMapOf<Int, Int>()
        val values = mutableMapOf<Int, Int>()
        val lists = mutableMapOf<Int, LinkedHashSet<Int>>()
        var min = -1

        fun get(key: Int): Int {
            if (capacity <= 0) {
                return -1
            }

            if (values.containsKey(key).not()) {
                return -1
            }

            val count = counts[key]!!
            counts[key] = count + 1
            lists[count]?.remove(key)

            if (count == min && lists[count]?.size == 0) {
                min++
            }

            lists.computeIfAbsent(count + 1) {
                LinkedHashSet()
            }.add(key)
            return values[key] ?: -1
        }

        fun put(key: Int, value: Int) {
            if (capacity <= 0) {
                return
            }

            if (values.containsKey(key)) {
                values[key] = value
                get(key)
                return
            }

            if (values.size >= capacity) {
                val first = lists[min]?.first!!
                counts.remove(first)
                values.remove(first)
                lists[min]?.remove(first)
            }

            values[key] = value
            counts[key] = 1
            min = 1
            lists.computeIfAbsent(1) { LinkedHashSet() }.add(key)
        }
    }
}
