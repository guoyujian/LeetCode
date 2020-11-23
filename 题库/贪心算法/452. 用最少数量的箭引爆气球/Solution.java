
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description 452. 用最少数量的箭引爆气球
 * @Date 2020/11/23
 * @Created by gyj
 *
 * 没想出来思路，但是代码能看懂= =
 */
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                return p1[1] > p2[1] ? 1 : p1[1] < p2[1] ? -1 : 0;
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}