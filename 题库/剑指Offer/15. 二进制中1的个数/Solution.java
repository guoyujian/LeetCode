
/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int m = 1;
        int res = 0;
        for (int i = 0; i < 32; i++) { //注意循环的次数
            if((n & m) != 0) { // 与运算的符号是&
                res ++;
            }
            m = m << 1; //左移
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(5));
    }
}