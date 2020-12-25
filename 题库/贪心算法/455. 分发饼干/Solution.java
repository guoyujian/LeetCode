
import java.util.Arrays;

/**
 * @Description 455. 分发饼干
 * @Date 2020/12/25
 * @Created by gyj
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //g的索引
        int i = 0;
        //s的索引
        int j = 0;
        while (i < g.length && j < s.length) {
            //只有满足条件，才能喂好孩子
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}