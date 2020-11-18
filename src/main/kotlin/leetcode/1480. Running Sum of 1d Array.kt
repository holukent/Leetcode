package leetcode

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        for (i in 0..nums.lastIndex) {
            if (i == 0) {
                result[i] = nums[i]
            }else {
                result[i] = nums[i] + result[i - 1]
            }
        }
        return result
    }
}