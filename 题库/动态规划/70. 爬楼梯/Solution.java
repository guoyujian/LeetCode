class Solution {
    public int climbStairs(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i < n + 1; i++) {
//            memo[i] = 1 + memo[i - 2] * 2; //状态转移方程分析错了
//            设跳上 n 级台阶有 f(n) 种跳法。在所有跳法中，青蛙的最后一步只有两种情况： 跳上 1 级或 2 级台阶。
//            当为 1 级台阶： 剩 n-1 个台阶，此情况共有 f(n−1) 种跳法；
//            当为 2 级台阶： 剩 n-2 个台阶，此情况共有 f(n−2) 种跳法。
            memo[i] = (memo[i - 2] + memo[i - 1]);
        }
        return memo[n];
    }
}