class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //dp[i][0]: 第i天的状态为未持有股票
        //dp[i][1]: 第i天的状态为持有股票
        int[][] dp = new int[n][2];
        for(int i = 0; i < n; i++) {
            //base case
            if(i == 0) {
                dp[i][0] = 0;
                dp[i][1] = -prices[i];
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[n-1][0];
    }
}