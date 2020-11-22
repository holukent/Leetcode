class Solution1 {
    fun subsets(nums: IntArray): List<List<Int>> {
        val list = mutableListOf<List<Int>>()
        list.add(listOf())
        backtracking(nums, list)
        return list
    }

    fun backtracking(nums: IntArray, list: MutableList<List<Int>>,) {
        for (i in nums.indices) {
            list.add(listOf(nums[i]))
            backtracking(nums.)
        }
    }

    fun sumOddLengthSubarrays(arr: IntArray): Int {

    }

}


fun main(args: Array<String>) {
    val solution = Solution1()

    println(solution.subsets(intArrayOf(1,2,3)))


}
