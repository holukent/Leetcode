package leetcode

fun lengthOfLongestSubstring(s: String): Int {
    if (s.length == 1) return 1
    var long = 0
    loop@for (i in 0 until s.lastIndex) {
        var temp = "${s[i]}"
        for (j in (i + 1)..s.lastIndex) {
            if (!temp.contains(s[j])) {
                temp += s[j]
                if (temp.length > long) long = temp.length
            } else {
                if (temp.length > long) long = temp.length
                continue@loop
            }
        }
    }
    return long
}