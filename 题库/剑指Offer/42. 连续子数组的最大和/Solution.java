

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
 **/
class Solution {
    public int maxSubArray(int[] nums) { //优化：还可以使用“滚动数组”，将时间复杂度降为O(1)
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int res = dp[0]; // 记录dp数组中的最大值
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution().maxSubArray(nums));
    }
}