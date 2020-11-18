


import java.util.ArrayList;
import java.util.List;

/**
 * @Description 134. 加油站
 * @Date 2020/11/18
 * @Created by gyj
 */
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) { //时间效率不高
        int len = gas.length;
        int[] gets = new int[len]; //gas - cost
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) { //赋值get并查找可能的开始循环的地址（即gets[i] >= 0）
            gets[i] = gas[i] - cost[i];
            if(gets[i] >= 0) {
                list.add(i);
            }
        }
        if(list.isEmpty()) { // 没有合适的入口返回-1
            return -1;
        }
        for (Integer i : list) {
            int remainedGas = gets[i]; //记录车辆的油量
            int j = (i + 1) % len; // 遍历指针
            while(j != i && remainedGas >= 0) {
                remainedGas += gets[j];
                j = (j + 1) % len;
            }
            if(j == i && remainedGas >= 0) {
                return i;
            }
        }

        return -1;
    }
}