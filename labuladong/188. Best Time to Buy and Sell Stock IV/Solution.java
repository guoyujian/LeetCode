class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(n <= 0) {
            return 0;
        }
        int max_k = k; 
        int[][][] dp = new int[n][max_k+1][2];
        for(int i = 0; i < n; i++) {
            for(k = 1; k <= max_k; k++) {
                //base case
                if(i == 0) {
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
            }
        }
        return dp[n-1][max_k][0];
    }
}