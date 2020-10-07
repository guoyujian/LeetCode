


import java.util.*;

/**
 * @Description 颜色分类
 * @Date 2020/10/07
 * @Created by gyj
 */
public class Solution {
    public void sortColors(int[] nums) {  //之前提交过一次，与之前的两次遍历思路不同。
        int p0=0, p2 = nums.length-1;
        if(nums.length < 2) {
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                nums[i] = nums[p0];
                nums[p0++] = 0;
            }
            if(nums[i] == 2) {
                nums[i--] = nums[p2];
                nums[p2--] = 2;
            }
        }
    }
}