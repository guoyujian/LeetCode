

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
 */
public class Solution {

    public String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        String s = "we are happy.";
        System.out.println(new Solution().replaceSpace(s));
    }
}
