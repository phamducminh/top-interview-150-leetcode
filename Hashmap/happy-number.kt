class Solution {
    fun isHappy(n: Int): Boolean {
        val set = hashSetOf<Int>()

        var temp = n
        while (set.add(temp)) {
            var sum = 0
            while (temp > 0) {
                val digit = temp % 10
                sum += digit * digit
                temp /= 10
            }
            temp = sum
        }

        return temp == 1
    }
}