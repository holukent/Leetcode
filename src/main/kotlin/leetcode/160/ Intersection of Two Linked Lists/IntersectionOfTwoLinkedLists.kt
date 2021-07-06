package leetcode.`160`.` Intersection of Two Linked Lists`

import leetcode.ListNode
import leetcode.Solution

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        if (headA == null || headB == null) return null
        val hashSet = hashMapOf<ListNode, Int>()
        var a = headA
        var b = headB
        while (a?.`val` != null || b?.`val` != null) {
            if (a?.`val` != null) {
                if (hashSet.containsKey(a)) return a else {
                    hashSet[a] = a.`val`
                    a = a.next
                }
            }
            if (b?.`val` != null) {
                if (hashSet.containsKey(b)) return b else {
                    hashSet[b] = b.`val`
                    b = b.next
                }
            }
        }
        return null
    }
}