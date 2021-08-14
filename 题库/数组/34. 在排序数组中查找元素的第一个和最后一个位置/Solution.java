

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target); //二分查找数字所在的位置
        if(pos < 0) {
            return new int[]{-1, -1};
        }
        int i = pos, j = pos;
        for (; i >= 0 && nums[i] == target; i--);
        for (; j < nums.length && nums[j] == target; j++);
        return new int[]{i+1, j-1};
    }


}