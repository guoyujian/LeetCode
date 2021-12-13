
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> need, window;
        need = new HashMap<>();
        window = new HashMap<>();
        int left = 0, right = 0;
        int start = 0;
        int valid = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i), 0) + 1);
        }

        while(right < s.length()) {
            char c = s.charAt(right);
            right ++;
            if(need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(need.get(c).equals(window.get(c))) {
                    valid ++;
                }
            }

            while(right - left >= p.length()) {
                if(valid == need.size()) {
                    res.add(left);
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
        return res;
    }
}