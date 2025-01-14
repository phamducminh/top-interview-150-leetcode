class Solution {
    fun lengthOfLastWord(s: String): Int {
        var r = s.length - 1
        var res = 0

        while (r >= 0) {
            if (s[r] == ' ') {
                if (res > 0) {
                    break
                } else {
                    r--
                }
            } else {
                r--
                res++
            }
        }

        return res
    }
}