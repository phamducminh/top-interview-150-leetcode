class Solution {
    fun isAlphanumeric(c: Char): Boolean = c.isLetter() || c.isDigit()

    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1

        while (l < r) {
            if (!isAlphanumeric(s[l])) {
                l++
            } else if (!isAlphanumeric(s[r])) {
                r--
            } else {
                if (s[l].lowercaseChar() != s[r].lowercaseChar()) {
                    return false
                } else {
                    l++
                    r--
                }
            }
        }

        return true
    }
}