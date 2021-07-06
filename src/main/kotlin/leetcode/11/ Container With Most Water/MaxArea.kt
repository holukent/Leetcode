package leetcode.`11`.` Container With Most Water`


class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var max = 0
        while (right > left) {
            when {
                height[left] > height[right] -> {
                    if (height[right] * (right - left) > max) max = height[right] * (right - left)
                    right--
                }
                height[left] < height[right] -> {
                    if (height[left] * (right - left) > max) max = height[left] * (right - left)
                    left++
                }
                else -> {
                    val tempHeight = height[left]
                    if (height[left] * (right - left) > max) max = height[left] * (right - left)
                    right--
                    left++
                    while (right > left) {
                        if (height[left] > tempHeight && height[right] > tempHeight) {
                            val tempMax = if (height[left] > height[right]) {
                                height[right] * (right - left)
                            } else {
                                height[left] * (right - left)
                            }
                            if (tempMax > max )  max = tempMax
                            break
                        }else {
                            if (height[left] <= tempHeight) left++
                            if (height[right] <= tempHeight) right--
                        }
                    }
                }
            }
        }
        return max
    }
}