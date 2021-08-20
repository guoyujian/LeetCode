import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
 **/
class Solution {
    public int lengthOfLongestSubstring(String s) { // 双指针，抄的答案。
        Map<Character, Integer> map = new HashMap<>();
        int i = -1;
        int res = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if(map.containsKey(ch)) {
                i = Math.max(i, map.get(ch));
            }
            map.put(ch, j);
            res = Math.max(res, j - i);
        }
        return res;
    }
}