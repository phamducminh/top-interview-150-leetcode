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
}