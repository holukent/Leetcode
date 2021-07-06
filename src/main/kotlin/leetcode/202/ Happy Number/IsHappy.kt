package leetcode.`202`.` Happy Number`

class Solution {
    fun isHappy(n: Int): Boolean {

        val set = hashSetOf<Int>()

        val num = { n: Int ->
            var result = 0
            var m = n
            while (true) {
                result += ((m % 10) * (m % 10))
                if (m == 0 ) break
                m /= 10
            }
            result
        }
        var result = num(n)
        while (true) {
            if (result == 1) return true else if (set.contains(result))  return false
            set.add(result)
            result = num(result)
        }
    }
}