

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> preNum = new HashMap<>();
        preNum.put(0, 1);
        int sum_i = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum_i += nums[i];
            int sum_j = sum_i - k; // sum_j是我们要找的累加和
            res += preNum.getOrDefault(sum_j, 0);
            preNum.put(sum_i, preNum.getOrDefault(sum_i, 0) + 1); // 把累加和加入到preNum中
        }
        return res;
    }

    public static void main(String[] args) {

    }
}