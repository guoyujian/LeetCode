class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Tuple[][] dp = new Tuple[n][n];
        //init
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                dp[i][j] = new Tuple(0, 0);
            }
        }
        //base case
        for(int i = 0; i < n; i++) {
            dp[i][i].fir = piles[i];
            dp[i][i].sec = 0;
        }

        
        for(int i = n-2; i >= 0; i--) {
            for(int j = i+1; j < n; j++) {
                int left = piles[i] + dp[i+1][j].sec; 
                int right = piles[j] + dp[i][j-1].sec;
                if(left > right) { //choose left
                    dp[i][j].fir = left;
                    dp[i][j].sec = dp[i+1][j].fir;
                } else {
                    dp[i][j].fir = right;
                    dp[i][j].sec = dp[i][j-1].fir;
                }
            }
        }
        Tuple res = dp[0][n-1];
        return res.fir - res.sec > 0;
    }
}
class Tuple {
    int fir;
    int sec;
    public Tuple(int fir, int sec) {
        this.fir = fir;
        this.sec = sec;
    }
}