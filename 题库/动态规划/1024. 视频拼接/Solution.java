

import java.util.*;

/**
 * @Description 1024.视频拼接
 * @Date 2020/10/24
 * @Created by gyj
 * 抄的
 * 贪心算法/动态规划
 */

/*
假设排序后的数组为a[][]：
                [0,5]
                [0,3]
                [1,6]
                [2,7]
                [2,5]
                [3,10]
                [10,15]
我们选择第一个[0,5],right = 5，对于a[i][0] <= 5 的数组，我们只需要找到能扩展到最大区间的数组，这个数组为[3,10]，记录max = 10,由于只需要计数，也就是说当a[i][0] > right时，计数加1即可，同时更新right为max = 10。一些细节下面代码有注释
*/
class Solution {
    public int videoStitching(int[][] clips, int T) {
        //排序，按a[0]升序，a[1]降序
        Arrays.sort(clips,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0] == b[0]){
                    return b[1]-a[1];
                }
                return a[0] - b[0];
            }
        });
        //起始位大于0，则不可能覆盖[0,T]直接返回。
        if(clips[0][0] > 0){
            return -1;
        }
        //第一个数是必须选择的，因为这个数是以0开头的最大区间。res也初始化为1。
        //max的作用是记录0-right区间取的最大区间。当clips[i][0] > right时，需要利用max更新right
        int right = clips[0][1];
        int max = right;
        int res = 1;
        for(int i = 1;i < clips.length;++i){
            if(right >= T){
                return res;
            }
            if(clips[i][0] > max){//当clips[i][0] > max，说明出现断层，直接返回-1
                return -1;
            }
            if(clips[i][0] > right){//当clips[i][0] > right，则必须选择一个新的值来更新区间，res+1，同时更新right
                res++;
                right = Math.max(max,right);
            }
            max = Math.max(max,clips[i][1]);//更新max
        }
        //需要注意的是，有可能数组的最后一个元素是需要被选择的，此时max和right并不相等，如果right已经满足了区间要求，则可以直接返回res，如果right不符合而max符合，则需要加上1
        if(right >= T){
            return res;
        }
        if(max >= T){
            return res+1;
        }
        return -1;
    }
}

