class Solution {
    public int minDistance(String word1, String word2) {
        //求两个字符串的最大字串长度（1143），即可推出本问题的答案
        int lcs = longestCommonSubsequence(word1, word2);
        return word1.length() + word2.length() - 2 * lcs;
    }

    private int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}