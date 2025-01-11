class Solution {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        var profit = 0

        for (i in 1 until n) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1]
            }
        }

        return profit
    }
}