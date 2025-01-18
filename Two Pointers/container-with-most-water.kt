class Solution {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size - 1

        var maxWater = 0

        while (l < r) {
            var curWater = (r - l) * min(height[l], height[r])
            maxWater = max(maxWater, curWater)
            if (height[l] < height[r]) {
                l++
            } else {
                r--
            }
        }

        return maxWater
    }
}