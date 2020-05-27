

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

//https://leetcode-cn.com/problems/count-primes/solution/ru-he-gao-xiao-pan-ding-shai-xuan-su-shu-by-labula/
public class Solution {
    public int countPrimes(int n) { //这种判断素数的方法叫做厄拉多塞筛法
        boolean isPrim[] = new boolean[n];
        int result = 0;
        Arrays.fill(isPrim, true);
        for(int i=2; i*i<n; i++){ //这里的判断为i*i<n即可
            if(isPrim[i]){
                for(int j = i*i; j < n; j+=i){
                    isPrim[j] = false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(isPrim[i]){
                ++result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(10));
    }
}
