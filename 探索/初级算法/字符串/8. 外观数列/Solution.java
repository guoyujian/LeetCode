

public class Solution {
    public String countAndSay(final int n) {
        return Solution.get("1", n);
    }

    private static String get(final String s, final int n) {
        if (n == 1) {
            return s;
        } else {
            int count;
            char ch;
            String str = "";
            for (int i = 0; i < s.length();) {
                for (ch = s.charAt(i), count = 0; i < s.length() && ch == s.charAt(i); i++, count++);
                str += count + String.valueOf(ch);
            }
            return get(str, n - 1);
        }
    }

    public static void main(final String[] args) {
        System.out.println(new Solution().countAndSay(5));

    }

}
