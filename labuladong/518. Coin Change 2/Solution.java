class Solution {
    public int change(int amount, int[] coins) {
        // dp[i][j] 的定义如下：
        // 若只使⽤前 i 个物品（可以重复使⽤），当背包容量为 j 时，有 dp[i][j] 种⽅法可以装满背包。
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < amount+1; j++) {
                if(j < coins[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j - coins[i-1]];
                }
            }
        }
        return dp[n][amount];
    
    
    }
}