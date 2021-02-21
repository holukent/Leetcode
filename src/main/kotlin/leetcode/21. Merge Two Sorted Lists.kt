package leetcode

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var node1 = l1
    var node2 = l2
    val result = ListNode(0)
    var current = result

    loop@while (node1 != null || node2 != null) {
        when {
            node1 == null -> {
                current.next = node2!!
                break@loop
            }
            node2 == null -> {
                current.next = node1
                break@loop
            }
            node1.`val` < node2.`val` -> {
                current.next = node1
                node1 = node1.next
            }
            else -> {
                current.next = node2
                node2 = node2.next
            }
        }
        current = current.next!!
    }
    return result.next
}