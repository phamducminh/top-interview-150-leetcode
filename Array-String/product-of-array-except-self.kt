class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val res = IntArray(n)
        val prefix = IntArray(n)
        val postfix = IntArray(n)

        var start = 1
        for (i in 0 until n) {
            start *= nums[i]
            prefix[i] = start
        }

        start = 1
        for (i in n - 1 downTo 0) {
            start *= nums[i]
            postfix[i] = start
        }

        for (i in 0 until n) {
            val left = if (i == 0) 1 else prefix[i - 1]
            val right = if (i == n - 1) 1 else postfix[i + 1]
            res[i] = left * right
        }

        return res
    }
}