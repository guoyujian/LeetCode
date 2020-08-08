package patterns.observer;

/**
 * @Description 两数相除
 * @Date 2020/7/16
 * @Created by 11599
 */
public class Solution {
    //抄的：https://leetcode-cn.com/problems/divide-two-integers/solution/po-su-de-xiang-fa-mei-you-wei-yun-suan-mei-you-yi-/
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // 判断结果是不是负数
        boolean isNegative = (dividend ^ divisor) < 0 ? true : false;

        // 将除数和被除数都转为负数
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;

        int res = helper(dividend, divisor);

        return isNegative ? -res : res;
    }

    private int helper(int dividend, int divisor) {
        if (dividend > divisor) {
            return 0;
        }

        int tmp = divisor;
        int count = 1;

        // 条件tmp + tmp < 0防止溢出
        while (tmp + tmp < 0 && dividend <= tmp + tmp) {
            count += count;
            tmp += tmp;
        }

        return count + helper(dividend - tmp, divisor);
    }
}
