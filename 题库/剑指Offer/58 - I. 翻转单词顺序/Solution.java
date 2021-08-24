

import java.util.StringTokenizer;

/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/
class Solution {
    public String reverseWords(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        String res = "";
        while(tokenizer.hasMoreTokens()) {
            res = tokenizer.nextToken() + " " + res;
        }
        return res.trim();
    }

    public static void main(String[] args) {

    }
}