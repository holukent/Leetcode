package leetcode

fun twoSum(nums: IntArray, target: Int): IntArray {
    var array: IntArray = IntArray(2)
    loop@for (i in 0 until nums.lastIndex) {
        for (j in i+1..nums.lastIndex) {
            if (nums[i] + nums[j] == target) {
                array = intArrayOf(i, j)
                break@loop
            }
        }
    }
    return array
}

fun twoSum1(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int,Int>()
    for(i in nums.indices){
        val diff = target - nums[i]
        if(map.containsKey(diff)){
            return intArrayOf(i, map[diff]!!)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}