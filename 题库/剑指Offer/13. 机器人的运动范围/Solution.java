
/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/
class Solution {
    public int movingCount(int m, int n, int k) {
        //思路：制造一个m*n的矩阵，计算每一个格子是否可行
        //最后从(0,0)开始遍历可以到达的格子数
        boolean[][] matrix = new boolean[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (calculate(i) + calculate(j) <= k);
            }
        }
        return helper(matrix, 0, 0); // 从0遍历
    }

    private static int helper(boolean[][] matrix, int i, int j) {
        if(i < 0 || i > matrix.length - 1 || j < 0 || j > matrix[0].length - 1 || !matrix[i][j]) {
            return 0;
        }
        matrix[i][j] = false;
        return 1 + helper(matrix, i-1, j) + helper(matrix, i+1, j) + helper(matrix, i, j-1)
                + helper(matrix, i, j+1);
    }

    public static int calculate(int num) {
        int tmp = 0;
        while(num != 0) {
            tmp += num % 10;
            num /= 10;
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(Solution.calculate(10));
//        boolean[][] matrix = {
//                {true, true, false},
//                {true, true, false},
//                {false, true, true}
//        };
//        System.out.println(Solution.helper(matrix, 0, 0));

//        System.out.println(new Solution().movingCount(38, 15, 9));
    }

}