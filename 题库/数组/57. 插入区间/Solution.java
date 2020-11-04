import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 57. 插入区间
 * @Date 2020/11/04
 * @Created by gyj
 */
class Solution {
    //有史以来调试最多的一次，且时间效率不好，有空看看标准答案
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0]; //新插入的两个区间的左端点和右端点
        int right = newInterval[1];
        List<int[]> list = new ArrayList<>();
        boolean haveBeenInserted = false;
        if(intervals == null || intervals.length == 0 || right < intervals[0][0]) {
            list.add(newInterval);
            haveBeenInserted = true;
        }
        for (int[] interval : intervals) {
            list.add(interval);
        }
        if(!haveBeenInserted) {
            for (int i = 0; i < list.size() - 1; i++) {
                if(left > list.get(i)[1] && right < list.get(i+1)[0]) {
                    list.add(i+1, newInterval);
                    haveBeenInserted = true;
                    break;
                }
            }
            if(left > list.get(list.size()-1)[1]) {
                list.add(newInterval);
                haveBeenInserted = true;
            }
        }
        if(haveBeenInserted) {
            //此时为已经插入，且与intervals中的集合没有交集，直接返回list即可
            int[][] res = new int[list.size()][2];
            for (int i = 0; i < list.size(); i++) {
                res[i] = list.get(i);
            }
            return res;
        }
        int insert_i = -1;
        for (int i = 0; i < list.size(); i++) {
            int left1 = list.get(i)[0];
            int right1 = list.get(i)[1];
            if(!haveBeenInserted) {
                if((left <= right1 && left >= left1) ||
                        (right <= right1 && right >= left1) ||
                        (left <=left1 && right >= right1)) {
                    //insert
                    left = Math.min(left, left1);
                    right = Math.max(right, right1) ;
                    int[] new_section = {left, right};
                    list.set(i,new_section);
                    haveBeenInserted = true;
                    insert_i = i;
                }
            } else {
                if(right >= list.get(i)[0]) {
                    right = Math.max(right, list.get(i)[1]);
                    list.set(insert_i, new int[]{left, right});
                    list.remove(i--);
                }
            }
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,5}};
        int[] newInterval = {0,6};
        int[][] inserts = new Solution().insert(intervals, newInterval);

        for (int[] insert : inserts) {
            System.out.println("{"+insert[0]+","+insert[1]+"}");
        }
    }
}