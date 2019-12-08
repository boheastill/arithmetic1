package cn.i623.arithmetic1.array;

public class TradeStocks {
    /**
     买卖股票:给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

     设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。

     注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     */
    /**
     * 思路：目标是盈利，一一比较俩天价格差异，求和
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int singleProfit = 0;
            singleProfit = prices[i + 1] - prices[i];
            if (singleProfit > 0) {
                profit += singleProfit;
            }
        }
        return profit;
    }
}
