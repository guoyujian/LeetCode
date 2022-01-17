import java.util.Arrays;


class Solution {
    public int lengthOfLIS(int[] nums) {
        //dp[i]：以nums[i]为结尾的最长严格递增子序列的长度
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for(int i=0; i < nums.length; i++) {
            for(int j=0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int res = 1;
        for(int i=0; i< dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}