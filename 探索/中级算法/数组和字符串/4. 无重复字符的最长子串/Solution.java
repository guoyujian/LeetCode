
import java.util.*;

/**
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {

    //
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int end = 0, start = 0; end < n; end++){
            char alpha = s.charAt(end);
            if(map.containsKey(alpha)){
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end-start+1);
            map.put(s.charAt(end), end+1);
        }
        return ans;
    } // 完全是抄的，思路没整明白。思路：滑动窗口



    public static void main(String[] args) {

    }
}
