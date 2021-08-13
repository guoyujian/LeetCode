

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
class Solution {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(n);
        return s1 + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(new Solution().reverseLeftWords(s, 2));
    }
}