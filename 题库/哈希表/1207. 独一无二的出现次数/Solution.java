

import java.util.*;

/**
 * @Description 独一无二的出现次数
 * @Date 2020/10/28
 * @Created by gyj
 */

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if(map.containsKey(num)) {
                map.replace(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,3};
        System.out.println(new Solution().uniqueOccurrences(nums));
    }
}

