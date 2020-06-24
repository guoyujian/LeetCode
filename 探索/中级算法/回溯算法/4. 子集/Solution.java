

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 子集，抄的……
 * @Date 2020/6/24
 * @Created by 11599
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, List<Integer> tmp) {
        res.add(new ArrayList<>(tmp)); // 如果这个地方写成res.add(tmp)就无法正确的add，为什么？

        for(int j=i; j<nums.length; j++){
            tmp.add(nums[j]);
            backtrack(j+1, nums, res, tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        List<List<Integer>> subsets = new Solution().subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

}
