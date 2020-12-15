
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 738. 单调递增的数字
 * @Date 2020/12/15
 * @Created by gyj
 * https://leetcode-cn.com/problems/monotone-increasing-digits/solution/dan-diao-di-zeng-de-shu-zi-by-leetcode-s-5908/
 */
class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] strN = String.valueOf(N).toCharArray();
        int i = 1;
        while (i < strN.length && strN[i - 1] <= strN[i]) {
            i += 1;
        }
        if (i < strN.length) {
            while (i > 0 && strN[i - 1] > strN[i]) {
                strN[i - 1] -= 1;
                i -= 1;
            }
            for (i += 1; i < strN.length; ++i) {
                strN[i] = '9';
            }
        }
        return Integer.parseInt(new String(strN));
    }


    public static void main(String[] args) {
        System.out.println(new Solution().monotoneIncreasingDigits(332));
    }
}