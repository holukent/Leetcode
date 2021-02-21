package leetcode

import kotlin.math.pow

fun getDecimalValue(head: ListNode?): Int {
    var result = ListNode(-1)
    var current = head
    while(current != null) {
        val temp = result.next
        result.next = ListNode(current.`val`)
        result.next?.next = temp
        current = current.next
    }
    var i = 0
    var sum = 0.0
    while (result.next != null) {
        if (result.next?.`val` == 1) sum += 2.0.pow(i)
        i++
        result = result.next!!
    }
    return sum.toInt()
}