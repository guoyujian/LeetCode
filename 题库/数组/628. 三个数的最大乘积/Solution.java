
import java.util.Arrays;

/**
 * @Description 628. 三个数的最大乘积
 * @Date 2021/1/20
 * @Created by gyj
 */
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
    }
}