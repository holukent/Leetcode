package leetcode

fun numberOfSteps (num: Int): Int {
    var result = num
    var count = 0
    while (result > 0) {
        if (result % 2 == 0) {
            result /= 2
        } else {
            result--
        }
        count++
    }
    return count
}