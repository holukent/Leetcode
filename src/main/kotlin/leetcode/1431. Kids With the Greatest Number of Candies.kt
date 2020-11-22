package leetcode

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val result = BooleanArray(candies.size)
    for (i in 0..candies.lastIndex) {
        result[i] = candies[i] + extraCandies >= candies.max() ?: 0
    }
    return result
}