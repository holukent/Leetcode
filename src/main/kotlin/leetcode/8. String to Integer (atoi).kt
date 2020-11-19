package leetcode

fun myAtoi(str: String): Int {
    var result = ""
    loop@for (i in 0..str.lastIndex) {
        if (str[i] == '-' || str[i] == '+' || str[i].isDigit()) {
            result += str[i]
            for (j in i+1..str.lastIndex) {
                if (str[j].isDigit()) {
                    result += str[j]
                }else if (str[j - 1].isDigit()) {
                    break@loop
                }else{
                    return 0
                }
            }
            break@loop
        }else if (str[i] != ' ') {
            return 0
        }

    }
    return if (result.toIntOrNull() != null) result.toInt()
    else if (result.length <= 1) 0
    else if (result[0] == '-') Int.MIN_VALUE
    else Int.MAX_VALUE
}