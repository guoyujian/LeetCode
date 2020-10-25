

import java.util.*;

/**
 * @Description 数组中的最长山脉
 * @Date 2020/10/24
 * @Created by gyj
 */

class Solution {
    /*
     维护一个数组B，B[i]为1或0或-1，为1表示A[i] > A[i+1]，为0表示A[i] = A[i+1]，为-1表示A[i] < A[i+1]，
     第二次遍历查找B[i] == 1 && B[i-1] == -1的元素索引值，即山脉的峰值，然后j,k分别向左向右延伸，查找山脉的长度
    */
    public int longestMountain(int[] A) { //时间效率一般
        int len = A.length;
        int[] B = new int[len];
        int longest = 0;
        if(len < 3) {
            return longest;
        }
        for(int i = 0; i < len-1; i++) {
            if(A[i] - A[i+1] > 0) {
                B[i] = 1;
            } else if(A[i] - A[i+1] < 0) {
                B[i] = -1;
            }
        }
        for(int i = 1; i < len-1; i++) {
            if(B[i] == 1 && B[i-1] == -1) {
                int j = i-1;
                int k = i+1;
                while(j-1 >= 0 && B[j-1] == -1) {
                    j--;
                }
                while(k < len && B[k] == 1) {
                    k++;
                }
                longest = Math.max(longest, k-j+1);
                i = k;
            }
        }
        return longest;
    }
}