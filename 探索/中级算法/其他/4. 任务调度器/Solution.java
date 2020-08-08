package patterns.observer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 任务调度器
 * @Date 2020/7/23
 * @Created by 11599
 */
public class Solution {

    //抄的官方题解，解法三，看的比较朦胧
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for (char task : tasks) {
            map[task - 'A'] ++;
        }
        Arrays.sort(map);
        int max_val = map[25] - 1;
        int idle_slots = max_val * n;
        for(int i = 24; i >= 0 && map[i] > 0; i--) {
            idle_slots -= Math.min(map[i], max_val); //为什么要选择最小的进行减法运算
        }
        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length; // ?
    }

}
