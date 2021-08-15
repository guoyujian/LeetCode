

import java.util.Arrays;

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
**/
class Solution {
    //从二维数组的右上角开始查找。如果当前元素等于目标值，则返回 true。
    // 如果当前元素大于目标值，则移到左边一列。
    // 如果当前元素小于目标值，则移到下边一行。
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == target) {
                return true;
            } else if(matrix[i][j] < target) {
                i++;
            } else if(matrix[i][j] > target) {
                j--;
            }

        }
        return false;
    }
}