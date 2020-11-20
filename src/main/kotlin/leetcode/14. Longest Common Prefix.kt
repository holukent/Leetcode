package leetcode

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    val temp = strs.sortedBy { it.length }
    for (i in 0..temp[0].lastIndex) {
        for (s in strs) {
            if (s.substring(0..i) != temp[0].substring(0..i)) {
                return if (temp[0].substring(0..i).length == 0) ""
                else temp[0].substring(0 until i)
            }
        }
    }
    return temp[0]
}