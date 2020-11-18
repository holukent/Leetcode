package leetcode

fun balancedStringSplit(s: String): Int {
    var result = 0
    var count = 0
    for (i in s) {
        if (i == 'L') count-- else count++
        if (count == 0) result++
    }
    return result
}