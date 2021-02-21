package leetcode

fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
    val map = hashMapOf<Int, IntArray>()

    for (p in pieces) {
        map[p[0]] = p
    }
    val result = IntArray(arr.size)
    var j = 0
    for (a in arr) {
        if (map.containsKey(a)) {
            for (i in map[a]!!) {
                result[j] = i
                j++
            }
        }
    }
    return arr.contentEquals(result)
}

