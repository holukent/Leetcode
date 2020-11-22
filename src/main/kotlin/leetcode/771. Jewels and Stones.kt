package leetcode

fun numJewelsInStones(J: String, S: String): Int {
    return S.count { it in J }
}