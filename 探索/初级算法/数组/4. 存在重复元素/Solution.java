import java.util.Arrays;

/**
 * @Classname Solution
 * @Date 2020/4/14 10:01
 * @Created by MetGuo
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] == nums[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(new Solution().containsDuplicate(nums));
    }
}
