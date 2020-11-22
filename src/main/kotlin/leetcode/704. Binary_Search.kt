package leetcode

fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.lastIndex

    while (true) {
        val middle = left + ((right - left) / 2)
        when {
            target == nums[middle] -> return middle

            right  <= left -> return -1

            target < nums[middle]-> {
                right = middle - 1
            }
            target > nums[middle] -> {
                left = middle + 1
            }
        }
    }
}