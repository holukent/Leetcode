package leetcode

fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(nums.size)
    var x = 0
    var y = n
    for (index in 0..nums.lastIndex step 2) {
        result[index] = nums[x]
        result[index + 1] = nums[y]
        x++
        y++
    }
    return result
}