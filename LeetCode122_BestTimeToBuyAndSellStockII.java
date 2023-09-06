// Problem 122: Best Time to Buy and Sell Stock II on LeetCode
// Abigail Beneduce

public int maxProfit(int[] prices) {
    int maxProfit = 0;
    
    for (int i = 1; i < prices.length; i++) {
        int profitToday = prices[i] - prices[i - 1];
        if (profitToday > 0) {
            maxProfit += profitToday;
        }
    }
    
    return maxProfit;
}
