class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var i = 0
        var j = 0
        var sum = 0
        var min = Int.MAX_VALUE

        while (j < nums.size) {
            sum += nums[j++]

            while (sum >= target) {
                min = minOf(min, j - i)
                sum -= nums[i++]
            }
        }

        return if (min == Int.MAX_VALUE) 0 else min
    }
}