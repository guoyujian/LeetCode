class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{};
        }
        //确定循环次数
        int n = matrix.length;  //n行
        int m = matrix[0].length; //m列
        int loop_num = (n < m ? n : m) / 2 +
                (n < m ? n : m) % 2;
        int[] res = new int[m * n];//结果存放
        int res_pos = 0;
        for (int k = 0; k < loop_num; k++) {
            int left = 0 + k, right = m-1-k, up = 0 + k, down = n-1-k;//界定范围
            int i = up, j = left; // 遍历指针
            while(j <= right && res_pos < res.length) {
                res[res_pos++] = matrix[i][j++];
            }
            j--;
            i++;
            while(i <= down && res_pos < res.length) {
                res[res_pos++] = matrix[i++][j];
            }
            i--;
            j--;
            while(j >= left && res_pos < res.length) {
                res[res_pos++] = matrix[i][j--];
            }
            j++;
            i--;
            while(i > up && res_pos < res.length) {
                res[res_pos++] = matrix[i--][j];
            }
        }
        return res;
    }
}