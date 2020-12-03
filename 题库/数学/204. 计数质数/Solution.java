

import java.util.*;

/**
 * @Description 204. 计数质数
 * @Date 2020/12/03
 * @Created by gyj
 */
class Solution {
    //厄拉多塞筛法
    public int countPrimes(int n) {
        if(n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n/2+1; i++) {
            if(!isPrime[i]) {
                continue;
            }
            int j=2;
            while(j*i <= n) {
                isPrime[j++*i] = false;
            }
        }
        int res = 0;
        for (int i = 2; i < isPrime.length - 1; i++) { //<n的质数
            if(isPrime[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countPrimes(12));
    }
}