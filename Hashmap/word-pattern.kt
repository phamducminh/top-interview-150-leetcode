class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val list = s.split(' ')

        if (pattern.length != list.size) return false

        val mapPatternToS = mutableMapOf<Char, String>()
        val mapSToPattern = mutableMapOf<String, Char>()

        pattern.forEachIndexed { i, pc -> 
            val word = list[i]

            if (!mapPatternToS.containsKey(pc) && !mapSToPattern.containsKey(word)) {
                mapPatternToS[pc] = word
                mapSToPattern[word] = pc
            } else if (mapPatternToS[pc] != word || mapSToPattern[word] != pc) {
                return false
            }
        }

        return true
    }
}