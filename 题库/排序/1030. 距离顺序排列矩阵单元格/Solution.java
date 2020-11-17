
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description 1030. 距离顺序排列矩阵单元格
 * @Date 2020/11/17
 * @Created by gyj
 */
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<int[]> list = new ArrayList<>(R*C);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                list.add(new int[]{i,j});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0) -
                        (Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0));
            }
        });
        int[][] res = new int[R*C][];
        for (int i = 0; i < R*C; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}