class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) {
            sum += num;
        }
        if(sum % 2 == 1) {
            return false;
        }
        sum = sum / 2;
        int N = nums.length;
        boolean[][] dp = new boolean[N+1][sum+1]; //默认值false
        //base case
        for(int i = 0; i < N; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= sum; j++) {
                if(j < nums[i-1]) {
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
                }

            }
        }
        return dp[N][sum];
    }
}