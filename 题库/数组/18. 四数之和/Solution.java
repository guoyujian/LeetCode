


import java.util.*;

/**
 * @Description 四数之和
 * @Date 2020/10/05
 * @Created by gyj
 */
public class Solution {
    //简单暴力的算法
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for(int i=0; i < nums.length-3; i++) {
            for(int j=i+1; j < nums.length-2; j++) {
                for(int k=j+1; k < nums.length-1; k++) {
                    for(int l=k+1; l < nums.length; l++) {
                        if(nums[i] + nums[j] +nums[k] +nums[l] == target) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            set.add(list);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}