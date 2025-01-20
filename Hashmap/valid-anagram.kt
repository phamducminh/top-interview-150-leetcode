class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        for (sc in s) {
            sMap[sc] = sMap.getOrDefault(sc, 0) + 1
        }

        for (tc in t) {
            tMap[tc] = tMap.getOrDefault(tc, 0) + 1
        }

        if (sMap.size != tMap.size) {
            return false
        }

        for (key in sMap.keys) {
            if (sMap[key] != tMap[key]) {
                return false
            }
        }

        return true
    }

}