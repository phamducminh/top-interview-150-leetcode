class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val temp = IntArray(n)

        for (i in 0 until n) {
            temp[i] = nums[(n - (k % n) + i) % n]
        }

        for (i in 0 until n) {
            nums[i] = temp[i]
        }
    }
}