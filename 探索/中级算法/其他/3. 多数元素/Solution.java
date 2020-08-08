
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 多数元素
 * @Date 2020/7/22
 * @Created by 11599
 */
public class Solution {
    public int majorityElement(int[] nums) { //时间效率太差！
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.length == 1) {
            return nums[0];
        }
        int bound = nums.length / 2;
        int mode = 0; //众数
        for (int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
                continue;
            }
            Integer count = map.get(num) + 1;
            if(count > bound) {
                mode = num;
                break;
            } else {
                map.put(num, count);
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(new Solution().majorityElement(nums));
    }
}
