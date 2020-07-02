
import java.util.*;

/**
 * @Description 合并区间
 * @Date 2020/7/2
 * @Created by 11599
 */
public class Solution {
    //先按区间左边界进行排序，相邻两个区间，左区间右边界是否大于等于右区间左边界，如果是，则合并，
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            list.add(interval);
        } //加入List方便操作
        int length = list.size();
        int i = 0;
        while(i < length-1){
            int[] left = list.get(i);
            int[] right = list.get(i+1);
            if(left[1] >= right[0]) {
                left[1] = right[1] > left[1] ? right[1] : left[1];
                list.set(i, left);
                list.remove(i+1);
                length--; // 合并后length-1;
            } else {
                i++; //不需要合并，则遍历指针+1
            }
        }
        int[][] res = new int[list.size()][];
        for (int j = 0; j < list.size(); j++) {
            res[j] = list.get(j);
        }
        return res;
    }



    public static void main(String[] args) {
        int[][] intervals = {{1,3},{3,18}};
        int[][] merges = new Solution().merge(intervals);
        for (int[] merge : merges) {
            System.out.println(merge[0] + "," + merge[1]);
        }


    }
}
