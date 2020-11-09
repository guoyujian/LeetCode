

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description 973. 最接近原点的 K 个点
 * @Date 2020/11/09
 * @Created by gyj
 */

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        List<int[]> list = new ArrayList<>();
        for (int[] point : points) {
            list.add(point);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                double f = Math.pow(new Double(p1[0]),2);
                return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
            }
        });
        int[][] res = new int[K][];
        for (int i = 0; i < K; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}