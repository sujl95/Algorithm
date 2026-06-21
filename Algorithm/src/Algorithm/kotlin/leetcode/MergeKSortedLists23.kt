package Algorithm.kotlin.leetcode

import java.util.PriorityQueue

private class MergeKSortedLists23 {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    private val pq = PriorityQueue<Int>()
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null
        if (lists.size == 1) {
            return lists[0]
        }
        for (list in lists) {
            if (list == null) {
                continue
            }
            pq.add(list.`val`)
            var next = list?.next
            while (next != null) {
                pq.add(next.`val`)
                next = next.next
            }
        }
        if (pq.isEmpty()) {
            return null
        }

        var first = ListNode(999999999)
        var currentNode = first
        while (pq.isNotEmpty()) {
            val poll = pq.poll()
            if (currentNode.`val` == 999999999) {
                val listNode = ListNode(poll)
                first = listNode
                currentNode = listNode
            } else {
                val node = ListNode(poll)
                currentNode.next = node
                currentNode = node
            }
        }
        return first
    }
}

fun main() {
    val mergeKSortedLists23 = MergeKSortedLists23()
    val list1 = MergeKSortedLists23.ListNode(1)
    list1.next = MergeKSortedLists23.ListNode(4)
    list1.next?.next = MergeKSortedLists23.ListNode(5)

    val list2 = MergeKSortedLists23.ListNode(1)
    list2.next = MergeKSortedLists23.ListNode(3)
    list2.next?.next = MergeKSortedLists23.ListNode(4)

    val list3 = MergeKSortedLists23.ListNode(2)
    list3.next = MergeKSortedLists23.ListNode(6)

    val lists = arrayOf(list1, list2, list3)
    val mergedList = mergeKSortedLists23.mergeKLists(lists as Array<MergeKSortedLists23.ListNode?>)

    var currentNode = mergedList
    while (currentNode != null) {
        print("${currentNode.`val`} ")
        currentNode = currentNode.next
    }
}
