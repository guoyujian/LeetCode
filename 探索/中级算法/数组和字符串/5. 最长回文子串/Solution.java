
import java.util.*;

/**
 * @Description 
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {

    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return "";
        }
        int max_len = 0;
        int start = 0;//记录最大回文字符串的起始位置
        for (int i = 0; i < s.length(); i++) {
            int left = i-1;
            int right = i+1;
            int len = 1;
            while(left>=0 && s.charAt(left) == s.charAt(i)){
                left--;
                len++;
            }
            while(right<s.length() && s.charAt(right) == s.charAt(i)){
                right++;
                len++;
            }
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                len += 2;
            }
            if(len > max_len){
                start = left;
                max_len = len;
            }
        }
        return s.substring(start+1, start+max_len+1);
    }//法一：中心扩散法；

    //法二：动态规划



    public static void main(String[] args) {
        String s = "a";
        System.out.println(new Solution().longestPalindrome(s));
    }
}
