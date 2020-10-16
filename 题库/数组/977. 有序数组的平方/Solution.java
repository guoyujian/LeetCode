


import java.util.*;

/**
 * @Description 有序数组的平方
 * @Date 2020/10/16
 * @Created by gyj
 */


public class Solution {
    public int[] sortedSquares2(int[] A) { //时间效率比较差：18ms
        if(A!=null && A.length == 0) {
            return A;
        }
        Integer[] B = Arrays.stream(A).boxed().toArray(Integer[]::new);
        Arrays.sort(B, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1) - Math.abs(o2);
            }
        });
        for (int i = 0; i < B.length; i++) {
            A[i] = B[i] * B[i];
        }
        return A;
    }


    public int[] sortedSquares1(int[] A) { //3ms
        if(A!=null && A.length == 0) {
            return A;
        }
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }
        Arrays.sort(A);
        return A;
    }

    //更好的方法：https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/977-you-xu-shu-zu-de-ping-fang-pai-xu-shuang-zhi-z/
    public int[] sortedSquares(int[] A) { //1ms
        int i=0, j=A.length-1, k=A.length-1;
        int[] B = new int[A.length];
        while(i <= j){
            if(A[i] * A[i] > A[j] * A[j]) {
                B[k--] = A[i] * A[i];
                i++;
            } else {
                B[k--] = A[j] * A[j];
                j--;
            }
        }
        return B;
    }


    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        int[] ints = new Solution().sortedSquares1(A);
        for (int n : ints) {
            System.out.println(n);
        }

    }
}

