


import java.util.*;

/**
 * @Description LCP 19. 秋叶收藏集
 * @Date 2020/10/01
 * @Created by gyj
 */


/*
参考：https://leetcode-cn.com/problems/UlBDOe/solution/qiu-xie-shou-cang-ji-by-leetcode-solution/
https://leetcode-cn.com/problems/UlBDOe/solution/java-quan-zhu-shi-li-jie-dong-tai-gui-hua-by-leetc/
 */
class Solution {
    public int minimumOperations(String leaves) {
        int n = leaves.length();
        if(leaves==null || "".equals(leaves)) {
            return 0;
        }
        /*
        state[i][j]中：
        i:表示第i个节点
        j:0表示左部分，1表示中间部分，2表示右部分
        state的值表示对于第0片到第i片叶子进行调整操作的次数
         */
        int[][] state = new int[n][3];
        char[] chars = leaves.toCharArray();
        /*
            1、第一个叶子，必须是左半部分，所以只需判断是不是 黄色叶子 即可
            2、第一个叶子，必须是左半部分，所以 state[0][1] 和 state[0][2] 都是无效的
            3、第二个叶子，可以是左半部分，也可以是中间部分，但是不能是右半部分(每个区间必须有叶子)，
            因此 state[1][2]是无效的
         */

        state[0][0] = chars[0] == 'y' ? 1 : 0; //如果第一个叶子是黄色的，那么就需要进行一次调整
        state[0][1] = state[0][2] = state[1][2] = Integer.MAX_VALUE;
        int isYellow = 0;
        for (int i = 1; i < chars.length; i++) {
            isYellow = chars[i] == 'y' ? 1 : 0;
            //三个状态转移方程
            state[i][0] = state[i-1][0] + isYellow;
            state[i][1] = Math.min(state[i-1][0], state[i-1][1]) + (1 - isYellow);
            if(i>1) {
                state[i][2] = Math.min(state[i-1][1], state[i-1][2]) + isYellow;
            }
        }
        return state[n-1][2];
    }
}