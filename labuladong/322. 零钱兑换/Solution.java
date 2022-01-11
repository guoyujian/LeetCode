


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    @Deprecated
    //没有消除重叠子问题
    private int dp0(int[] coins, int amount) {
        if(amount == 0) return 0;
        if(amount < 0)  return -1; //问题无解
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = dp0(coins, amount - coin);
            if(subProblem != -1) {
                res = Math.min(res, 1 + subProblem);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }


    private int dp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin : coins) {
                if(i - coin < 0)    continue; // 无解
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }
}