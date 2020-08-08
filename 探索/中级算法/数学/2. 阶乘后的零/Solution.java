
/**
 * @Description TODO
 * @Date 2020/7/12
 * @Created by 11599
 */
public class Solution {
    //1-n的范围内，出现5都会增长0，注意有些数字中因子5的个数有多个，例如125。
    public int trailingZeroes(int n){
        int count = 0;
        while(n > 1) {
            count += (n /= 5);
        }
        return count;
    }
}
