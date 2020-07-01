

import java.util.Arrays;
import java.util.logging.Level;

/**
 * @Description 在排序数组中查找元素的第一个和最后一个位置
 * @Date 2020/7/1
 * @Created by 11599
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res, -1);
        if(nums.length == 0) {
            return res;
        }
        int index = searchIndex(nums, target, 0, nums.length - 1);
        if(index == -1) {
            return res;
        }
        int left = index, right = index;
        while(left-1 >= 0 && nums[left-1] == target){
            left--;
        }
        while(right+1 <= nums.length-1 && nums[right+1] == target){
            right++;
        }
        res[0] = left;
        res[1] = right;
        return res;
    }//二分查找法查找左右两个索引。

    private int searchIndex(int nums[], int target, int left, int right){
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target){
            return searchIndex(nums, target, mid+1, right);
        } else {
            return searchIndex(nums, target, left, mid-1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10,10};
        int target = 6;
        int[] range = new Solution().searchRange(nums, target);
        for (int i : range) {
            System.out.println(i);
        }
    }
}
