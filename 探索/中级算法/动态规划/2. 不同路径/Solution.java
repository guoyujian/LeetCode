
/**
 * @Description 不同路径
 * @Date 2020/7/7
 * @Created by 11599
 */
public class Solution {
    /*
    抄的：其本质是计算组合数C(m+n-2, m-1);
    解释：要走到右下角一定是向右走m-1步，向下走n-1步。也就是说总共走m-1+n-1 (m+n-2) 步，其中有m-1步是向右的。那么这就是一个组合的问题，从m+n-2步中选择m-1步向右，总共有C(m+n-2,m-1)种排列方式。
     */
    public int uniquePaths(int m, int n) {
        long ans=1;
        for(int i=0;i<Math.min(m-1,n-1);i++){
            ans*=m+n-2-i;
            ans/=i+1;
        }
        return (int)ans;
    }
}
