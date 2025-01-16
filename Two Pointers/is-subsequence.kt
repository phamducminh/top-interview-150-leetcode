class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val sLen = s.length
        val tLen = t.length
        var s1 = 0
        var t1 = 0

        while (s1 < sLen && t1 < tLen) {
            if (s[s1] == t[t1]) {
                s1++
            }
            t1++
        }

        return s1 == sLen
    }
}