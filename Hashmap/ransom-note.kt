class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map1 = hashMapOf<Char, Int>()
        val map2 = hashMapOf<Char, Int>()
        
        ransomNote.forEach { c -> map1[c] = map1.getOrDefault(c, 0) + 1 }
        magazine.forEach { c -> map2[c] = map2.getOrDefault(c, 0) + 1 }
        
        for ( (character, count) in map1.entries) {
            if (!map2.containsKey(character) || map2[character]!! < count) {
                return false
            }
        }
        
        return true
    }
}