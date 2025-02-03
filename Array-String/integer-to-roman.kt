class Solution {
    fun intToRoman(num: Int): String {
        val numbers = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romans = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        val ans = StringBuilder()
        var N = num
        var i = 0
        while (N > 0) {
            while (N >= numbers[i]) {
                ans.append(romans[i])
                N -= numbers[i]
            }
            i++
        }

        return ans.toString()
    }
}