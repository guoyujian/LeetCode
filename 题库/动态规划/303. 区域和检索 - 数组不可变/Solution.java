package patterns.observer;

import java.util.Arrays;

/**
 * @Description 303. 区域和检索 - 数组不可变
 * @Date 2021/3/01
 * @Created by gyj
 */
class NumArray {
    private int[] nums ;
    public NumArray(int[] nums) {
        this.nums = Arrays.copyOf(nums, nums.length);
    }

    public int sumRange(int i, int j) {
        int res = 0;
        for (int p = i; p <= j; p++) {
            res += nums[p];
        }
        return res;
    }
}