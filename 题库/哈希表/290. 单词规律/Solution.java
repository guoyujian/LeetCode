
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 290. 单词规律
 * @Date 2020/12/16
 * @Created by gyj
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] keys = pattern.toCharArray();
        String[] vals = s.split(" ");
        if(keys.length != vals.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();

        for (int i = 0; i < keys.length; i++) {
            if(!map.containsKey(keys[i]) && !map1.containsKey(vals[i])) {
                map.put(keys[i], vals[i]);
                map1.put(vals[i],keys[i]);
            } else if(!map.containsKey(keys[i]) || !map1.containsKey(vals[i])){
                return false;
            } else {
                if(!vals[i].equals(map.get(keys[i])) || keys[i] != map1.get(vals[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(new Solution().wordPattern(pattern, s));
    }


}