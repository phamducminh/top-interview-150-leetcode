class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1

        while (l < r) {
            val sum = numbers[l] + numbers[r]
            when {
                sum == target -> break
                sum < target -> l++
                sum > target -> r--
            }
        }

        return intArrayOf(l+1, r+1)
    }
}