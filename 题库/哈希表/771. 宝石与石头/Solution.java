


import java.util.*;

/**
 * @Description 宝石与石头
 * @Date 2020/10/02
 * @Created by gyj
 */
class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        if(J == null || S == null || "".equals(J) || "".equals(S)) {
            return 0;
        }
        char[] charsJ = J.toCharArray();
        char[] charsS = S.toCharArray();
        int num = 0;
        for (char ch : charsJ) {
            set.add(ch);
        }
        for (char ch : charsS) {
            if(set.contains(ch)) {
                num ++;
            }
        }
        return num;
    }
}