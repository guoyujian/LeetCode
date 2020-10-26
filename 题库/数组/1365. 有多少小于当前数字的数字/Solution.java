

import java.util.*;

/**
 * @Description 有多少小于当前数字的数字
 * @Date 2020/10/26
 * @Created by gyj
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) { //暴力求解
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    res[i]++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] res = new Solution().smallerNumbersThanCurrent(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }
}