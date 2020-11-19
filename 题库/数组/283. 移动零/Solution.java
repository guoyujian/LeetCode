
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 283. 移动零
 * @Date 2020/11/19
 * @Created by gyj
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int left = -1, right = 0; // left指向已经整理好的序列最后一个，right指向
        while(right < nums.length) {
            if(nums[right] != 0) {
                nums[++left] = nums[right];
                if(left != right ) {
                    nums[right++] = 0;
                } else {
                    right++;
                }
            } else {
                right++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
//        int[] nums = {0,0,1,0,0};
//        int[] nums = {0,0,0,0,1};
        int[] nums = {1,0,0,0,0};


        new Solution().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}