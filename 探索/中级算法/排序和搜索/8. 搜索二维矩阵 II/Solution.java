

/**
 * @Description 搜索二维矩阵 II
 * @Date 2020/7/3
 * @Created by 11599
 */
public class Solution {
    /*
    先横着找，再竖着找，只要这两者中其中一个能找到，就可以判定
     */
    @Deprecated
    public boolean searchMatrix0(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length; // 行数和列数
        if(target < matrix[0][0] || target > matrix[row-1][col-1]) {
            return false;
        }
        int i = 0, j = 0;
        while(i < row && matrix[i][0] <= target){
            i++;
        }
        i--; //定位到行
        for (; j < col; j++) {
            if(matrix[i][j] == target) {
                return true;
            }
        } /* 先找行后找列 */

        i = 0;
        j = 0;
        while(j < col && matrix[0][j] <= target){
            j++;
        }
        j--; //定位到列
        for (; i < row; i++) {
            if(matrix[i][j] == target) {
                return true;
            }
        } /* 先找列后找行 */

        return false;
    } //这种思想是错误的

    /*
    抄的：从左下角开始找，target大于当前元素则向右找，小于则向上找。
    此题不能选主对角线的两个角作为起点
     */
    //来源：https://leetcode-cn.com/problems/search-a-2d-matrix-ii/solution/sou-suo-er-wei-ju-zhen-ii-by-leetcode-2/ 方法4
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else { // found it
                return true;
            }
        }
        return false;

    }





    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7,9},{2,4,6,8,10},{11,13,15,17,19},{12,14,16,18,20},{21,22,23,24,25}};

        System.out.println(new Solution().searchMatrix(matrix, 13));

    }
}

