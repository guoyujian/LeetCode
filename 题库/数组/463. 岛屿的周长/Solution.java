package patterns.observer;


/**
 * @Description 463. 岛屿的周长
 * @Date 2020/10/30
 * @Created by gyj
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) {
                    continue;
                }
                int num = 0;
                if(i-1 >= 0 && grid[i-1][j] != 0) {
                    num ++;
                }
                if(j-1 >= 0 && grid[i][j-1] != 0) {
                    num ++;
                }
                if(i+1 < grid.length && grid[i+1][j] != 0) {
                    num ++;
                }
                if(j+1 < grid[0].length && grid[i][j+1] != 0) {
                    num ++;
                }
                res += (4-num);
            }
        }
        return res;
    }
}

