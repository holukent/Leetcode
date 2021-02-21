package leetcode

fun isPalindrome(x: Int): Boolean {
    return if (x >= 0) {
        x.toString().reversed() == x.toString()
    } else {
        false
    }
}