package leetcode

fun validPalindrome(s: String): Boolean {
    fun validPalindrome1(s: String): Boolean {
        println(s)
        var start = 0
        var last = s.lastIndex
        while (last > start) {
            if (s[start] != s[last]) return false
            start++
            last--
        }
        return true
    }
    var start = 0
    var last = s.lastIndex
    while (last > start) {
        if (s[start] != s[last]) {
            return (validPalindrome1(s.substring(start, last )) ||
                    validPalindrome1(s.substring(start + 1, last + 1)))
        }
        start++
        last--
    }
    return true
}

