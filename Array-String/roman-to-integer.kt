class Solution {
    fun romanToInt(s: String): Int {
        var res = 0

        val map = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )

        var i = s.length - 1
        while (i >= 0) {
            if (i != 0 && s[i] == 'V' && s[i-1] == 'I') {
                res += 4
                i -= 2
            } else if (i != 0 && s[i] == 'X' && s[i-1] == 'I') {
                res += 9
                i -= 2
            } else if (i != 0 && s[i] == 'L' && s[i-1] == 'X') {
                res += 40
                i -= 2
            } else if (i != 0 && s[i] == 'C' && s[i-1] == 'X') {
                res += 90
                i -= 2
            } else if (i != 0 && s[i] == 'D' && s[i-1] == 'C') {
                res += 400
                i -= 2
            } else if (i != 0 && s[i] == 'M' && s[i-1] == 'C') {
                res += 900
                i -= 2
            } else {
                res += map[s[i]]!!
                i--
            }
        }

        return res
    }
}