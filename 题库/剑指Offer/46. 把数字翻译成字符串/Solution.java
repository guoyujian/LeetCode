

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
 **/
class Solution {
    public int translateNum(int num) { //第一次独立做出动态规划的题目。
//        String str = num + ""; // 执行效率不高
        String str = String.valueOf(num);
        int n = str.length();
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        if(str.charAt(0) == '1' || (str.charAt(0) == '2' && str.charAt(1) < '6' )) {
            dp[1] = 2;
        } else {
            dp[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            if(str.charAt(i-1) == '1' || (str.charAt(i-1) == '2' && str.charAt(i) < '6' )) {
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[n-1];
    }
}