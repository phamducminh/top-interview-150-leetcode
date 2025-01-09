class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 0
        var r = 0
        val set = hashSetOf<Int>()

        while (r < nums.size) {
            if (!set.contains(nums[r])) {
                nums[l] = nums[r]
                set.add(nums[r])
                l++
                r++
            } else {
                r++
            }
        }

        return l
    }
}