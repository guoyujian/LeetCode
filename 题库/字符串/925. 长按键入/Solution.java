

import sun.security.util.Length;

import java.util.*;

/**
 * @Description 长按键入
 * @Date 2020/10/21
 * @Created by gyj
 */

public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] types = typed.toCharArray();
        char[] names = name.toCharArray();
        int i=0, j=0;
        if(names[0] != types[0] || names[names.length-1] != types[types.length-1]) {
            return false;
        }
        char last = names[0];
        while(i < types.length && j < names.length) {
            if(types[i] == names[j]) {
                last = types[i++];
                j++;
            } else if(types[i] != names[j] && last != types[i]) {
                return false;
            } else if(types[i] != names[j] && last == types[i]) {
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isLongPressedName("pyplrz", "ppyypllr"));
    }
}

