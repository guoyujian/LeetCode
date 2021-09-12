

class Solution {
    public int strToInt(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        long num = 0;
        char[] chars = str.toCharArray();
        int i = 0;
        int digit = 1;
        while(i < chars.length && chars[i] == ' ')  i++;
        if(i >= chars.length || ((chars[i] > '9' || chars[i] < '0') && chars[i] != '-' && chars[i] != '+')) {
            return 0;
        } else if(chars[i] == '-') {
            i++;
            digit = -1;
        } else if(chars[i] == '+') {
            i++;
        }
        for (; i < chars.length && chars[i] >='0' && chars[i] <= '9'; i++) {
            num *= 10;
            num += (chars[i] - '0');
            if(digit == -1 && num > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            } else if(digit == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        num *= digit;
        if(num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(num > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        } else {
            return (int) num;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().strToInt("-2147483647"));
    }
}