package leetcode

fun xorOperation(n: Int, start: Int): Int {
    var result = start
    for (i in 1 until n) {
        result = result xor (start + 2 * i)
        println(result)
    }
    return result
}