package leetcode

fun numIdenticalPairs(nums: IntArray): Int {
    var result = 0
    for (i in 0 until nums.lastIndex) {
        for (j in i+1..nums.lastIndex) {
            if (nums[i] == nums[j]) {
                result++

            }
        }
    }
    return result
}