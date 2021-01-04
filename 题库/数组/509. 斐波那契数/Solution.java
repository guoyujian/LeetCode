
/**
 * @Description 509. 斐波那契数
 * @Date 2021/1/4
 * @Created by gyj
 */

class Solution {
    public int fib(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}