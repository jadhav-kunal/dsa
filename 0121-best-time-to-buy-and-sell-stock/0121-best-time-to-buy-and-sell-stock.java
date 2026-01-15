class Solution {
    public int maxProfit(int[] prices) {
        int currMin = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < currMin) {
                currMin = prices[i];
            } else if (prices[i] - currMin > profit) {
                profit = prices[i] - currMin;
            }
        }
        return profit;
    }
}