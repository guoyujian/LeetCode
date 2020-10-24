
import java.util.*;

/**
 * @Description 子数组的最小值之和
 * @Date 2020/10/24
 * 抄的：https://leetcode-cn.com/problems/sum-of-subarray-minimums/solution/leetcodebi-ji-java-py-si-ke-yi-dao-ti-907-zi-shu-3/
 */


class Solution {
    int MOD = 1000000007;

    public int sumSubarrayMins(int[] A) {
        Stack<Pair> stack = new Stack<>();
        int res = 0, tmp = 0;
        for (int i = 0; i < A.length; i++) {
            int count = 1;
            while (!stack.empty() && stack.peek().val >= A[i]) {
                Pair pop = stack.pop();
                count += pop.count;
                tmp -= pop.val * pop.count;
            }
            stack.push(new Pair(A[i], count));
            tmp += A[i] * count;
            res += tmp;
            res %= MOD;
        }
        return res;
    }
}

class Pair {
    public int val;
    public int count;

    public Pair(int val, int count) {
        this.val = val;
        this.count = count;
    }
}
