class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxPrice = prices[0], minPrice = prices[0], maxPro = 0;
        int i = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) i++;
            minPrice = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) i++;
            maxPrice = prices[i];
            maxPro += maxPrice - minPrice;
        }
        return maxPro;
    }
}