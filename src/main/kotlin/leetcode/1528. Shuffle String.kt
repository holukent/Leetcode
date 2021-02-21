package leetcode

fun restoreString(s: String, indices: IntArray): String {
    var result = ""
    val map = hashMapOf<Int, Char>()
    for (i in 0..s.lastIndex) {
        map[indices[i]] = s[i]
    }
    map.values.forEach {
        result += it
    }
    return result
}