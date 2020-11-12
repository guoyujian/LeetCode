

/**
 * @Description 922. 按奇偶排序数组 II
 * @Date 2020/11/12
 * @Created by gyj
 */


class Solution {
    //双指针，官方题解思路2
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2) {
            if(A[i] % 2 == 1) {
                while(A[j] % 2 == 1) {
                    j += 2;
                }
                swap(A, i, j);
            }
        }
        return A;
    }

    private void swap(int[] A, int a, int b) {
        int tmp = A[a];
        A[a] = A[b];
        A[b] = tmp;
    }
}