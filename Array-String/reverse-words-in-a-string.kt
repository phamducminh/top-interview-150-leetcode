class Solution {
    fun reverseWords(s: String): String {
        val res = StringBuilder()

        var start = false
        var r = s.length - 1
        var curString = ""

        while (r >= 0) {
            if (s[r] == ' ') {
                if (start) {
                    res.append(curString.reversed() + " ")
                    // res.append(" ")
                    curString = ""
                    start = false
                }
                
                r--
            } else {
                curString += s[r]
                start = true

                if (r == 0) {
                    res.append(curString.reversed() + " ")
                }
                r--
            }
        }

        res.deleteCharAt(res.length - 1)

        return res.toString()
    }
}