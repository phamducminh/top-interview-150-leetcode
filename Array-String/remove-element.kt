class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            if (nums[l] == `val` && nums[r] != `val`) {
                val temp = nums[l]
                nums[l] = nums[r]
                nums[r] = temp
                l++
                r--
            } else if (nums[r] == `val`) {
                r--
            } else if (nums[l] != `val`) {
                l++
            }
        }

        return l
    }
}