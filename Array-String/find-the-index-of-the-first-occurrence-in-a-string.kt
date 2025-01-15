class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var res = -1
        val m = haystack.length
        val n = needle.length

        if (m < n) return res

        var i = 0
        var j = 0
        while (i + j < m) {
            if (haystack[i + j] == needle[j]) {
                if (j == n - 1) {
                    res = i
                    break
                } else {
                    j++
                }
            } else {
                i++
                j = 0
            }
        }

        return res
    }
}