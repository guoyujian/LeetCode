
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 数组中的第K个最大元素
 * @Date 2020/6/28
 * @Created by 11599
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer tmp[] = new Integer[k];
        for (int num : nums) {
            int i = 0;
            for (; i < k && tmp[i]!=null && num < tmp[i]; i++); // 找到待插入的位置
            if(i<k){
                for(int j = k-2; j >= i; j--){
                    tmp[j+1] = tmp[j];
                }
                tmp[i] = num;
            }
        }
        return tmp[k-1];
    }


    public static void main(String[] args) {
        int nums[] = {-1, -1};
        int k = 2;
        System.out.println(new Solution().findKthLargest(nums, k));

    }

}
