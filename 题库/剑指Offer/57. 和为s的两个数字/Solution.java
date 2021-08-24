
/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/
class Solution {
    public int[] twoSum(int[] nums, int target) { //不难，自己做的
        if(nums == null || nums.length < 2) {
            return null;
        }
        int p = 0, q = nums.length - 1;
        do{
            while(q >= 0 && target - nums[p] < nums[q]) {
                q--;
            }
            while(p < nums.length && target - nums[q] > nums[p]) {
                p++;
            }
            if(q >= 0 && p < nums.length && p < q && nums[p] + nums[q] == target) {
                return new int[]{nums[p], nums[q]};
            }
        } while(p < q);
        return null;
    }
}