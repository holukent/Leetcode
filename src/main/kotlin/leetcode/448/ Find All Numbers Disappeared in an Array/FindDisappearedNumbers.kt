package leetcode.`448`.` Find All Numbers Disappeared in an Array`

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val list = MutableList(nums.size) { it + 1 }
        for (i in nums) {
            list[i - 1] = 0
        }
        list.removeAll { it == 0 }
        return list
    }
}