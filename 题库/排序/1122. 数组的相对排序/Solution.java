


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 1122. 数组的相对排序
 * @Date 2020/11/14
 * @Created by gyj
 */
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] vals = new int[arr2.length];
        List<Integer> list = new ArrayList<>();
        for (int ele : arr1) {
            int i = 0;
            for (; i < arr2.length; i++) {
                if(ele == arr2[i]) {
                    vals[i]++;
                    break;
                }
            }
            if(i >= arr2.length) {
                list.add(ele);
            }
        }
        int i = 0;
        for (int j = 0; j < vals.length; j++) {
            int num = vals[j];
            while(num > 0) {
                arr1[i++] = arr2[j];
                num--;
            }
        }
        Collections.sort(list);
        for (int j = 0; i < arr1.length; i++, j++) {
            arr1[i] = list.get(j);
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        new Solution().relativeSortArray(arr1, arr2);
    }
}