

import java.util.Arrays;

/**
 * @Description 1128. 等价多米诺骨牌对的数量
 * @Date 2021/1/26
 * @Created by gyj
 */
 //TODO: 超出时间复杂度
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) { //简单粗暴de超出时间范围
        int num = 0;
        for (int i = 0; i < dominoes.length; i++) {
            for (int j = i + 1; j < dominoes.length; j++) {
                int[] dominoe1 = dominoes[i];
                int[] dominoe2 = dominoes[j];
                if((dominoe1[0] == dominoe2[0] && dominoe1[1] == dominoe2[1]) ||
                    (dominoe1[0] == dominoe2[1] && dominoe1[1] == dominoe2[0])) {
                    num ++;
                }
            }
        }
        return num;
    }
}