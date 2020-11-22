package leetcode

import kotlin.math.max

fun maxDepth(s: String): Int {
    var count = 0
    var max = 0
    for (i in 0..s.lastIndex) {
        when(s[i]) {
            '(' -> {
                count++
                max = max(count,max)
            }
            ')' -> {
                count--
            }
        }
    }
    return max
}