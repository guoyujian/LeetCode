
/**
 * @Description Pow(x, n)
 * @Date 2020/7/14
 * @Created by 11599
 */
public class Solution {
    public double myPow0(double x, int n) { //开个玩笑
        return Math.pow(x, n);
    }

    //抄的：
    public double myPow(double x, int n) { //递归，分治法降低时间复杂度。
        if(x==0 || n == 0) {
            return 1.0;
        }
        if(n == Integer.MIN_VALUE) { // 当n为最小值时，取相反数会溢出，故做特殊处理
            return myPow(x, n+1) / x;
        }

        if(n < 0) { 
            return 1.0 / myPow(x, -n);
        }
        double tmp = myPow(x, n/2);
        return n % 2 == 0 ? tmp * tmp : tmp * tmp * x;

    }

}
