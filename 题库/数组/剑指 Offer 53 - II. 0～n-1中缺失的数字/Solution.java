

/**
 * @Description 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @Date 2020/10/29
 * @Created by gyj
 */

//还可以使用二分查找
public class Solution {
    public int missingNumber(int[] nums) {
        int i = 0 ;
        for (; i < nums.length; i++) {
            if(i != nums[i]) {
                return i;
            }
        }
        return i;
    }
}


