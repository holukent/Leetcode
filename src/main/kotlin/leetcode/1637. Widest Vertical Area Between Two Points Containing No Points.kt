package leetcode

fun maxWidthOfVerticalArea(points: Array<IntArray>): Int{
    var max = 0
    val result = points.sortedBy { it[0] }
    for (i in 0 until result.lastIndex) {
        if (result[i + 1][0] - result[i][0] > max) max = result[i + 1][0] - result[i][0]
    }
    return max
}