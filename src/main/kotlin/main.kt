class Solution1 {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var min = Int.MAX_VALUE
        var result = 0
        nums.sort()
        for (i in 0 until nums.lastIndex) {
            var l = i + 1
            var r = nums.lastIndex
            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                val distance = Math.abs(sum - target)
                if (min > distance) {
                    min = distance
                    result = sum
                }
                when {
                    min == 0 -> return sum
                    sum > target -> r--
                    else -> l++
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val solution = Solution1()
    println(solution.threeSumClosest(intArrayOf(1,1,1,0),-100))

}
