


import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        int left, right; //滑动窗口[left,right)
        left = right = 0;
        int valid = 0; //有效数
        Map<Character, Integer> need, window;
        need = new HashMap<>();
        window = new HashMap<>();
        int start = 0, len = Integer.MAX_VALUE; // 记录最小子串起始位置和长度
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        while(right < s.length()) {
            char c = s.charAt(right); //进入滑动窗口的字符
            right ++;
            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(need.get(c))) {
                    valid ++;
                }
            }

            //判断是否左边界是否需要缩小
            while(valid == need.size()) {
                if(right - left < len) {
                    start = left;
                    len = right- left;
                }
                char d = s.charAt(left);
                left ++;
                if(need.containsKey(d)) {
                    if(need.get(d).equals(window.get(d))) {
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }

        }
        System.out.println(start + "__" + len);
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(new Solution().minWindow(s, t));

    }
}