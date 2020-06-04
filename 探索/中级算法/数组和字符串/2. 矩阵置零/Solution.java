

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {
    public void setZeroes(int[][] matrix) { // 使用O(m+n)的空间复杂度，还有更好的办法
        boolean isThisColZero[] = new boolean[matrix[0].length];
        boolean isThisRowZero[] = new boolean[matrix.length];
        Arrays.fill(isThisColZero, false);
        Arrays.fill(isThisRowZero, false);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    isThisRowZero[i] = true;
                    isThisColZero[j] = true;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            if(isThisRowZero[i]){
                for(int j=0; j<matrix[i].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j=0; j<matrix[0].length; j++){
            if(isThisColZero[j]){
                for(int i=0; i<matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }





    public static void main(String[] args) {
        int matrix[][] = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        new Solution().setZeroes(matrix);
        for(int i=0; i<matrix.length; i++){
            String str = "";
            for(int j=0; j<matrix[0].length; j++){
                str += matrix[i][j] + ",";
            }
            System.out.println(str);
        }
    }
}
