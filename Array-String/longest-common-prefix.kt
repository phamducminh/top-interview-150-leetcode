class Solution {
    fun commonPrefix(str1: String, str2: String): String {
        var res = StringBuilder()
        val n = min(str1.length, str2.length)
        
        for (i in 0 until n) {
            if (str1[i] == str2[i]) {
                res.append(str1[i])
            } else {
                break
            }
        }

        return res.toString()
    }

    fun longestCommonPrefix(strs: Array<String>): String {
        val n = strs.size
        if (n == 1) return strs[0]
        var res = commonPrefix(strs[0], strs[1])
        
        for (i in 2 until n) {
            if (res.isEmpty()) {
                break
            } else {
                res = commonPrefix(res, strs[i])
            }
        }
        
        return res
    }
}