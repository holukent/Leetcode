package leetcode

fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
    val result = ArrayList<Int>()
    for (i in 0..index.lastIndex) {
        result.add(index[i],nums[i])
    }
    return result.toIntArray()
}