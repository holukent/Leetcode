package leetcode

fun longestPalindrome(s: String): String {
    var result = ""
    var max = ""
    for (i in s.indices) {
        for (j in (i + 1)..s.length) {
            result = s.substring(i,j).run {
                var temp:Boolean =true
                var left = 0
                var right = this.lastIndex
                loop@while (left <= right){
                    if (this[left] == this[right]) {
                        left++
                        right--
                    }else {
                        temp = false
                        break@loop
                    }
                }
                if (temp) {
                    max = if (this.length > max.length) this else max
                    max
                } else ""
            }
        }
    }
    return result
}