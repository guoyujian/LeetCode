

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 989. 数组形式的整数加法
 * @Date 2021/1/22
 * @Created by gyj
 */
/*
让我们逐位将数字加在一起。例如计算 123+912，
我们从低位到高位依次计算 3+23+2、2+12+1 和 1+91+9。
任何时候，若加法的结果大于等于 10，把进位的 1 加入到下一位的计算中
所以最终结果为 1035。
 */
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;//有进位
                sum -= 10;
            }
            res.add(sum);
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
}