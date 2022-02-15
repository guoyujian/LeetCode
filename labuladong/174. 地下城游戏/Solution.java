import java.util.Arrays;

//174
class Solution {
    private int[][] memo;
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        memo = new int[m][n];
        //初始化memo
        for(int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return dp(dungeon, 0, 0);
    }
    //从 grid[i][j] 到达终点（右下⻆）所需的最少⽣命值是 dp(grid, i, j)。
    public int dp(int[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;
        if(i == m-1 && j == n-1) { // 到达右下角最后一格
            return grid[i][j] > 0 ? 1 : (-grid[i][j] + 1);
        }
        if(i == m || j == n) { //越界返回最大值
            return Integer.MAX_VALUE;
        }

        if(memo[i][j] != -1) {
            return memo[i][j];
        }
        //状态转移
        int res = Math.min(
            dp(grid, i+1, j),
            dp(grid, i, j+1)
        ) - grid[i][j];
        memo[i][j] = res <= 0 ? 1 : res; 
        return memo[i][j];

    }
}