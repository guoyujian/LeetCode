

/**
 * @Description 岛屿数量
 * @Date 2020/6/18
 * @Created by 11599
 */
public class Solution {

    public int numIslands(char[][] grid) { // 利用图的深度优先遍历，遍历次数就是岛屿的数量。
        if(grid==null || grid.length==0 || grid[0].length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j, row, col);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j, int row, int col){
        if(i<0 || j<0 || i>=row || j>= col || grid[i][j] == '0'){
            return ;
        }
        grid[i][j] = '0'; // 遍历过的都置为0
        dfs(grid, i+1, j, row, col);
        dfs(grid, i-1, j, row, col);
        dfs(grid, i, j+1, row, col);
        dfs(grid, i, j-1, row, col); /*对四个方向进行深度搜索*/
    }


    public static void main(String[] args) {

    }
}
