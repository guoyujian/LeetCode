
/**
 * @Description x 的平方根
 * @Date 2020/7/15
 * @Created by 11599
 */
public class Solution {
    public int mySqrt0(int x) { //输入2147395600时输出不对，但是不晓得为什么
        if(x == 0) {
            return 0;
        }
        int i = 1;
        for (; i * i <= x; i++) ;
        return --i;
    }
    //抄的
    public int mySqrt(int x) { //二分查找
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = (r + l) / 2;
            if ((long)mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2147395600));
    }
}
