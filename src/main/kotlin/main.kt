import leetcode.*
import java.util.*

fun main() {

    val list1 = ListNode(3)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(0)
    list1.next!!.next!!.next = ListNode(-4)
    list1.next!!.next!!.next!!.next = list1.next!!
    list1.next = ListNode(1)


    val list2 = ListNode(1)
    list2.next = ListNode(0)
    list2.next!!.next = ListNode(0)

    val list3 = ListNode(1)

    println(getDecimalValue(list2))

}

