

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/

class Solution {
    public int missingNumber(int[] nums) {
        if(nums[nums.length - 1] == nums.length - 1) {
            return nums.length;
        }
        return search(nums, 0, nums.length-1);
    }

    public static int search(int[] nums, int start, int end) {
        if(start > end)    return start;
        int mid = (start + end) / 2;
        if(nums[mid] == mid) {
            return search(nums, mid + 1, end);
        } else {
            return search(nums, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,4};
        System.out.println(new Solution().missingNumber(nums));
    }
}