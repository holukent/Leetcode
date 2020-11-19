class Solution1 {
    fun romanToInt(s: String): Int {
        val map = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var answear = map[s[s.lastIndex]]!!
        for (i in s.lastIndex - 1 downTo 0) {
            if (map[s[i + 1]]!! > map[s[i]]!!) {
                answear -= map[s[i]]!!
            }else {
                answear += map[s[i]]!!
            }
        }
        return answear
    }
}

fun main(args: Array<String>) {
    val solution = Solution1()
    println(solution.romanToInt("MCMXCIV"))

}
