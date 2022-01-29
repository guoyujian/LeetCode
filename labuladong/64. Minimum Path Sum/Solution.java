class Solution {
    //自己写的
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        //base case 
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == m || j == n) {
                    dp[i][j] = Integer.MAX_VALUE;
                } else if(i == m-1 && j == n-1) {
                    dp[i][j] = grid[i][j];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        
        for(int i = m-1; i >= 0; i--) {
            for(int j = n-1; j >= 0; j--) {
                if(i == m-1 && j == n-1) {
                    continue;
                }
                dp[i][j] = grid[i][j] + Math.min(
                    dp[i+1][j], dp[i][j+1]
                );
            }
        }
        return dp[0][0];

    }
}