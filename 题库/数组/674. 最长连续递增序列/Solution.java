
/**
 * @Description 674. 最长连续递增序列
 * @Date 2021/1/24
 * @Created by gyj
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int len = 1;
        int max_len = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                len ++;
            } else {
                len = 1;
            }
            max_len = Math.max(max_len, len);
        }
        return max_len;
    }
}