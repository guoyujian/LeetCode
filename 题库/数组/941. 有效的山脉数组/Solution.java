
import java.util.*;

/**
 * @Description 941. 有效的山脉数组
 * @Date 2020/11/03
 * @Created by gyj
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        int i = 0;
        int j = A.length-1;
        if(A.length < 3 || A[i] >= A[i+1] || A[j-1] <= A[j]) {
            return false;
        }
        while(A[i] < A[i+1]){
            ++i;
        }
        while(A[j] < A[j-1]){
            --j;
        }
        return i>=j;
    }

    public static void main(String[] args) {
        int[] A = {0,1,1,3,2,1};
        System.out.println(new Solution().validMountainArray(A));
    }
}