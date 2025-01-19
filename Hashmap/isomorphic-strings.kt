class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val mapStoT = mutableMapOf<Char, Char>()
        val mapTtoS = mutableMapOf<Char, Char>()

        s.forEachIndexed { i, sc ->
            val tc = t[i]

            if (!mapStoT.containsKey(sc) && !mapTtoS.containsKey(tc)) {
                mapStoT.put(sc, tc)
                mapTtoS.put(tc, sc)
            } else if (mapStoT[sc] != tc || mapTtoS[tc] != sc) {
                return false
            }
        }

        return true
    }
}