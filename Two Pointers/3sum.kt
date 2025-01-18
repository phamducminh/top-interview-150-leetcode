class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val n = nums.size
        val res = hashSetOf<List<Int>>()
        nums.sort()

        for (i in 0 until n - 2) {
            var l = i + 1
            var r = n - 1

            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                if (sum == 0) {
                    res.add(listOf(nums[i], nums[l], nums[r]))
                    l++
                    r--
                } else if (sum < 0) {
                    l++
                } else {
                    r--
                }
            }
        }

        return res.toList()
    }
}