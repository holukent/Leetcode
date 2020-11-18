package leetcode

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in 0..nums.lastIndex) {
        result[i] = nums.count { nums[i] > it }
    }
    return result
}