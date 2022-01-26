

/**
0-1 背包问题：
⼀个可装载重量为 W 的背包和 N 个物品，每个物品有重量和价值两个属性。
其中第 i 个物品的重量为wt[i]，价值为 val[i]，现在让你⽤这个背包装物品，最多能装的价值是多少？
 */
public class Solution {

    public int knapsack(int W, int N, int[] wt, int[] val) {
        //base case dp[0][:] = 0 && dp[:][0] = 0,这里在创建数组的时候就初始化好了        
        int[][] dp = new int[N+1][W+1];
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= W; j++) {
                if(wt[i-1] > W) {
                    //第i个物品的重量大于背包可载重量，只能不放
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(
                        dp[i-1][j - wt[i-1]] + val[i-1],
                        dp[i-1][j]
                    );
                }

            }
        }
        return dp[N][W];
    }

}