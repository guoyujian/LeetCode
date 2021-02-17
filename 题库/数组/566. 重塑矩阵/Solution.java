package patterns.observer;

/**
 * @Description 566. 重塑矩阵
 * @Date 2021/2/17
 * @Created by gyj
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(row * col != r * c) {
            return nums;
        }
        int[][] new_matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                new_matrix[i][j] = nums[(i*c+j)/col][i*c+j - (i*c+j)/col * col];
            }
        }
        return new_matrix;
    }

}