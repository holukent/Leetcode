package leetcode

fun threeSum(nums: IntArray): List<List<Int>> {
    val result = HashSet<List<Int>>()
    nums.sort()
    for (i in 0 until nums.lastIndex) {
        var l = i + 1
        var r = nums.lastIndex
        while (l < r) {
            var sum = nums[i] + nums[l] + nums[r]
            when {
                sum == 0 -> result.add(listOf(nums[i],nums[l++],nums[r--]))
                sum < 0 -> l++
                else -> r--
            }
        }
    }
    return result.toList()
}