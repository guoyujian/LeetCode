package patterns.observer;

import java.util.Arrays;

/**
 * @Description 263. 丑数
 * @Date 2021/4/10
 * @Created by gyj
 */
class Solution {
    public boolean isUgly(int n) {
        if(n == 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if(n % 2 == 0) {
            return isUgly(n / 2);
        } else if(n % 3 == 0) {
            return isUgly(n / 3);
        } else if(n % 5 == 0) {
            return isUgly(n / 5);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isUgly(7));
    }
}