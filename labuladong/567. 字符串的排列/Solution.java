

import java.util.HashMap;
import java.util.Map;

class Solution {
    //s1 = "ab" s2 = "eidbaooo"
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need, window;
        need = new HashMap<>();
        window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;

        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        while(right < s2.length()) { //窗口右边界++
            char c = s2.charAt(right);
            right ++;

            if(need.containsKey(c)) {
                //只有当字符c存在于s1中才添加
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(need.get(c).equals(window.get(c))) { //
                    valid ++;
                }
            }
            //当window的区间长度大于s1时
            while(right - left >= s1.length()) { // *是大于等于
                if(need.size() == valid) {
                    return true;
                }
                char d = s2.charAt(left);
                left ++;
                if(need.containsKey(d)) {
                    if(need.get(d).equals(window.get(d))) {
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return false;
    }
}