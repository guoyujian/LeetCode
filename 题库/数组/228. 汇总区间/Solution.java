

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 228. 汇总区间
 * @Date 2021/1/10
 * @Created by gyj
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) {
            return list;
        }
        int i = 0;
        while(i < nums.length) {
            int j = 0;
            for(; i+j < nums.length && nums[i+j] == nums[i] + j; j++);
            if(j-1==0) { //a == b
                list.add(nums[i]+"");
            } else {
                list.add(nums[i]+"->"+nums[i+j-1]);
            }
            i = i + j;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}