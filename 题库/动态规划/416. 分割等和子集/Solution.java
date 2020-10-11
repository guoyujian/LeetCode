


import java.util.*;

/**
 * @Description 分割等和子集：没太懂
 * @Date 2020/10/11
 * @Created by gyj
 * @Reference https://leetcode-cn.com/problems/partition-equal-subset-sum/solution/xian-pai-xu-zai-dong-tai-gui-hua-2msshuang-94-by-z/
 */
class Solution {
    public boolean canPartition(int[] nums) {
        Arrays.sort(nums);

        int sum=0;
        int partition=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        if(sum%2!=0){
            return false;
        } //如果sum是奇数，那就直接返回false

        partition=sum/2;  //找到sum和partition

        if(nums[nums.length-1]>partition){ //数组中最大的数比partition大，则返回false
            return false;
        }else if(nums[nums.length-1]==partition){
            return true;
        } //数组中最大的数是sum的一半，则返回true

        partition=partition-nums[nums.length-1];

        for (int i = nums.length-2; i >= 0 ; i--) {
            if(nums[i]<=partition){
                int copy=partition;
                copy-=nums[i];
                if(copy==0){
                    return true;
                }
                for (int j = i-1; j >= 0; j--) {
                    if(nums[j]<=copy) {
                        copy -= nums[j];
                        if (copy == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}