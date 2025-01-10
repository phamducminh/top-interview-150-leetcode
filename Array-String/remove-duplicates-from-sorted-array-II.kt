class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (num in nums) {
            if (i == 0 || i == 1 || nums[i-2] != num) {
                nums[i] = num
                i++
            }
        }
        return i
    }
}