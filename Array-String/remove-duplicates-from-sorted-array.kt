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

    fun removeDuplicates(nums: IntArray): Int {
        val n = nums.size
        if (n <= 1) return n
        var j = 0

        for (i in 0 until n - 1) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i]
            }
        }

        nums[j++] = nums[n - 1]
        
        return j
    }
}