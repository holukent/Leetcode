package leetcode
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    var ans = 0.0
    val nums = (nums1 + nums2).sorted()
    val mid = nums.lastIndex / 2
    ans = if (nums.size % 2 == 0) {
        (nums[mid] + nums[mid + 1]).toDouble() / 2
    }else {
        nums[mid].toDouble()
    }
    return ans
}
