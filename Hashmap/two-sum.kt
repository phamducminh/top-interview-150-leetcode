class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val ans = IntArray(2)

        val hashMap = mutableMapOf<Int, Int>()

        for (i in 0 until nums.size) {
            val x = nums[i]
            val y = target - x

            if (hashMap.containsKey(y)) {
                if (hashMap[y] != i) {
                    ans[0] = i
                    ans[1] = hashMap[y]!!
                    break
                }
            } else {
                hashMap[x] = i
            }
        }

        return ans
    }
}