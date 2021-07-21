

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
