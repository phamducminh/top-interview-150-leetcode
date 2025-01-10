class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        var res = nums[0]
        var max = Int.MIN_VALUE
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1

            if (map[num]!! > max) {
                max = map[num]!!
                res = num
            }
        }

        return res
    }

    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0

        for (i in 0 until nums.size) {
            if (count == 0) candidate = nums[i]
            if (nums[i] == candidate) count++
            else count--
        }

        return candidate
    }
}