class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val ans = mutableListOf<List<String>>()
        val mapAnagrams = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sortedStr = str.toCharArray().sorted().joinToString("")

            if (mapAnagrams.containsKey(sortedStr)) {
                mapAnagrams[sortedStr]!!.add(str)
            } else {
                mapAnagrams[sortedStr] = mutableListOf(str)
            }
        }

        for (value in mapAnagrams.values) {
            ans.add(value)
        }

        return ans
    }
}