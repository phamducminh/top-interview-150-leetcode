class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var longest = 0

        for (n in nums) {
            // check if it the start of the a sequence
            if (n - 1 !in numSet) {
                var length = 0
                while (numSet.contains(n + length)) {
                    length++
                }
                longest = max(length, longest)
            }
        }

        return longest
    }
}