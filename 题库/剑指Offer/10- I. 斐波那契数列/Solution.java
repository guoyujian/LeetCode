
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
public class Solution {
    //递归：超时
    public int fib0(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return (fib0(n-1) + fib0(n-2)) % 1000000007;
        }
    }

    //动态规划
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
