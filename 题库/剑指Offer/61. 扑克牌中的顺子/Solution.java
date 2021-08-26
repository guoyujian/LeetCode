

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isStraight(int[] nums) {
        //顺子就是不能有重复，不能有间断
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;

        for (int i : nums) {
            if(set.contains(i)) { //如果有重复就不是顺子
                return false;
            }
            if(i == 0)  continue; //跳过大小王
            max = Math.max(max, i);  //最大牌
            min = Math.min(min, i);  //最小牌
            set.add(i);
        }
        return max - min < 5; //最大最小小于5则是顺子。
    }

    public static void main(String[] args) {
        int[] nums = {11,8,12,8,10};
        System.out.println(new Solution().isStraight(nums));
    }
}