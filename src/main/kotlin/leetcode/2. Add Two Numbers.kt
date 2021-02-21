package leetcode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {

    var node1 = l1
    var node2 = l2
    val result = ListNode(0)

    var current = result
    var r = 0
    while (node1 != null || node2 != null) {
        var sum = when {
            node1?.`val` == null -> node2!!.`val` + r
            node2?.`val` == null -> node1.`val` + r
            else -> node1.`val` + node2.`val` + r
        }
        sum = if (sum > 9) {
            r = 1
            sum - 10
        } else {
            r = 0
            sum
        }
        current.next = ListNode(sum)
        current = current.next!!
        node1 = node1?.next
        node2 = node2?.next
    }
    if (r == 1) current.next = ListNode(r)
    return result.next!!
}

