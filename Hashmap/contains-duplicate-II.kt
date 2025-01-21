class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = hashMapOf<Int, Int>()

        nums.forEachIndexed { index, value -> 
            if (!map.containsKey(value)) {
                map[value] = index
            } else {
                var diff = index - map[value]!!
                if (diff > k) {
                    map[value] = index
                } else {
                    return true
                }
            }
        }

        return false
    }
}