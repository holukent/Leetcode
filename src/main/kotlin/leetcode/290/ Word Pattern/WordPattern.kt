package leetcode.`290`.` Word Pattern`

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val inputString = s.split(" ")
        if(pattern.length != inputString.size ) return false
        val hashKey = HashMap<Char, String>()
        val hashValue = HashMap<String, Char>()

        var i = 0
        while (i <= pattern.length - 1) {
            if (hashKey.containsKey(pattern[i])){
                if (hashKey[pattern[i]] != inputString[i]) return false
            }
            if (hashValue.containsKey(inputString[i])) {
                if (hashValue[inputString[i]] != pattern[i]) return false
            }
            hashKey[pattern[i]] = inputString[i]
            hashValue[inputString[i]] = pattern[i]
            i++
        }
        return true
    }
}