class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        //确定循环次数
        int n = matrix.length;  //n行
        int m = matrix[0].length; //m列
        int loop_num = (n < m ? n : m) / 2 +
                (n < m ? n : m) % 2;
        int capacity = m * n;
        List<Integer> res = new ArrayList<>(capacity);
        int res_pos = 0;
        for (int k = 0; k < loop_num; k++) {
            int left = 0 + k, right = m-1-k, up = 0 + k, down = n-1-k;//界定范围
            int i = up, j = left; // 遍历指针
            while(j <= right && res_pos < capacity) {
                res.add(matrix[i][j++]);
                res_pos++;
            }
            j--;
            i++;
            while(i <= down && res_pos < capacity) {
                res.add(matrix[i++][j]);
                res_pos++;
            }
            i--;
            j--;
            while(j >= left && res_pos < capacity) {
                res.add(matrix[i][j--]);
                res_pos++;
            }
            j++;
            i--;
            while(i > up && res_pos < capacity) {
                res.add(matrix[i--][j]);
                res_pos++;
            }
        }
        return res;
    }
}