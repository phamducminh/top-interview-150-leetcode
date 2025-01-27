class Solution {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        val paperCounts = IntArray(n + 1)

        for (c in citations) {
            paperCounts[min(n, c)] += 1 
        }

        var h = n
        var papers = paperCounts[n]

        while (papers < h) {
            h -= 1
            papers += paperCounts[h]
        }

        return h
    }
}