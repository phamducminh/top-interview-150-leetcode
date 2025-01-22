class Solution {
    fun jump(nums: IntArray): Int {
        var ans = 0
        val n = nums.size
        var l = 0
        var r = 0

        while (r < n - 1) {
            var farthest = 0
            for (i in l .. r) {
                farthest = max(farthest, i + nums[i])
            }

            l = r + 1
            r = farthest
            ans++
        }

        return ans
    }
}