package leetcode

fun subtractProductAndSum(n: Int): Int {
    val arr = n.toString().toCharArray().map { it.toString().toInt() }
    var pruduct = 1
    arr.forEach {
        pruduct *= it
    }
    return pruduct - arr.sum()
}