package leetcode

fun hasCycle(head: ListNode?): Boolean {
    var one = head?.next
    var two = head?.next?.next
    while (one != null && two != null) {
        if (one == two) return true
        one = one.next
        two = two.next?.next
    }
    return false

//    val set = mutableSetOf<ListNode>()
//    var current = head
//
//    while (current != null) {
//        if (set.contains(current)) return true
//        set.add(current)
//        current = current.next
//    }
//    return false
}
