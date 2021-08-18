class Solution {
    public int maxProfit(int[] prices) { //还可以降低空间复杂度，但是为了直观，先这么做
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int cost = Integer.MAX_VALUE;
        int[] dp = new int[n];
        dp[0] = 0; //首日利润为0
        for (int i = 1; i < n; i++) {
            cost = Math.min(cost, prices[i-1]); //cost : 前i-1天中最低价格
            dp[i] = Math.max(dp[i-1], prices[i] - cost); //dp[i] 代表以 prices[i]prices[i] 为结尾的子数组的最大利润
        }
        return dp[n-1];
    }
}