package patterns.observer;

/**
 * @Description 两整数之和
 * @Date 2020/7/20
 * @Created by 11599
 */
public class Solution {
    //抄的：核心思想是，a^b得到无进位的加法，(a&b)<<1得到进位，循环此过程直到进位为0
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
