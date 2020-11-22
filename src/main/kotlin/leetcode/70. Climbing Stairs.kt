package leetcode

fun climbStairs(n: Int): Int {
    if (n <= 2) return n
    var last = 0
    var last1 = 1
    var last2 = 2
    for (i in 2 until n) {
        last = last1 + last2
        last1 = last2
        last2 = last
    }
    return last
}