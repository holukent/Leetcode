package leetcode

fun isPalindrome(s: String): Boolean {
    val result = s.toLowerCase()
    var start = 0
    var last = result.lastIndex
    while (last > start) {
        if (result[start] == result[last]) {
            start++
            last--
        }
        if (!result[start].isLetterOrDigit()) start++
        if (!result[last].isLetterOrDigit()) last--
        if(result[start].isLetterOrDigit() && result[last].isLetterOrDigit() && result[start] != result[last]){
            return false
        }
    }
    return true
}
