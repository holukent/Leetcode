package leetcode.`859`.` Buddy Strings`

class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        val set = mutableSetOf<Pair<Char, Char>>()
        val arr = IntArray(26)
        for (i in 0..s.lastIndex) {
            if (s[i] != goal[i]) set.add(Pair(s[i], goal[i]))
            arr[s[i] - 'a'] += 1
        }
        if (s == goal) return arr.count { it >= 2 } >= 1
        if (set.size == 2) {
            return !(set.first().first != set.last().second || set.first().second != set.last().first)
        }else return false

    }
}
