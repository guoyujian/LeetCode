
/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
class Solution {
    //本题返回的是int而不是string，所以不考虑大数的情况。
    public int[] printNumbers(int n) {
        double endDouble = Math.pow(10, n) - 1;
        int end = new Double(endDouble).intValue();
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i+1;
        }
        return res;
    }
}