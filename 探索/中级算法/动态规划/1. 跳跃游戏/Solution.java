
/**
 * @Description 跳跃游戏
 * @Date 2020/7/5
 * @Created by 11599
 */
public class Solution {

    public boolean canJump0(int[] nums) {
        return helper(nums, 0);
    }//超出了时间限制


    private boolean helper(int[] nums, int index){ //当前位置
        if(index >= nums.length-1){
            return true;
        }
        int maxStep = nums[index];
        for(int i=maxStep; i>0; i--){
            if(helper(nums, i+index)) {
                return true;
            }
        }
        return false;
    }

    /*
    官方思路，依次遍历数组，维护一个跳跃的最远距离。如果该距离大于等于数组长度-1，则返回true
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return true;
        }
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            if(i <= maxLength){
                maxLength = Math.max(i + nums[i], maxLength);
                if(maxLength >= n-1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,0};

        System.out.println(new Solution().canJump(nums));
    }
}
