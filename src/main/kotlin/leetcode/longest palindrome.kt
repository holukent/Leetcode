fun longestPalindrome(s: String): Int {
    var count = 0
    for (i in '\u0041'..'\u005A') {
        val n = s.count { it == i }
        if (n >= 2 && n % 2 == 0) {
            count += n
        }else if (n >= 2 && n % 2 == 1) {
            count = count + n - 1
        }
    }
    for (i in '\u0061'..'\u007A') {
        val n = s.count { it == i }
        if (n >= 2 && n % 2 == 0) {
            count += n
        }else if (n >= 2 && n % 2 == 1) {
            count = count + n - 1
        }
    }
    if (s.length != count) count++
    return count
    /*    var cs = ""
    loop@for (c in s) {
        if (c in cs) continue@loop
        val n = s.count { it == c }
        if (n >= 2 && n % 2 == 0) {
            count += n
        }else if (n >= 2 && n % 2 == 1) {
            count = count + n - 1
        }
        cs += c
    }*/
}
