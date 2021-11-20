

/**
 * @Description 304. 二维区域和检索 - 矩阵不可变
 * @Date 2021/11/20
 * @Created by 11599
 * 维护一个二维 preSum 数组，专门记录以原点为顶点的矩阵的元素之和
 */
class NumMatrix {
    private int[][] preNum;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        preNum = new int[m+1][n+1];
        for (int i = 1; i < preNum.length; i++) {
            for (int j = 1; j < preNum[0].length; j++) {
                preNum[i][j] = preNum[i-1][j] + preNum[i][j-1] + matrix[i-1][j-1] - preNum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return preNum[row2+1][col2+1] - preNum[row1][col2+1] - preNum[row2+1][col1]
                + preNum[row1][col1];
    }
}
