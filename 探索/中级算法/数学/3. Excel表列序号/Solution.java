

import java.util.HashMap;
import java.util.Map;

/**
 * @Description Excel表列序号，未验证
 * @Date 2020/7/13
 * @Created by 11599
 */
public class Solution {

    //'Z'-'A'+1即可得'Z'对应的数字
    public int titleToNumber(String s) {
        double res = 0;
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = len-1; i >= 0; i--) {
            res += (chars[i] - 'A' + 1) * Math.pow(26, len-1-i);
        }
        return (int) res;
    }

    public static void main(String[] args) {
        String s = "BN";
        System.out.println(new Solution().titleToNumber(s));
    }
}
