

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 1232. 缀点成线
 * @Date 2021/1/20
 * @Created by gyj
 */
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //说明：尽量不要用除法，精度、效率都不如乘法
        //这里利用共线向量线性相关，行列式=0的性质来做
        if(coordinates.length <= 2) {
            return true;
        }
        int[] p1 = coordinates[0];
        int[] p2 = coordinates[1];
        int deltax = p2[0] - p1[0];
        int deltay = p2[1] - p1[1];

        for (int i = 2; i < coordinates.length; ++i) {
            int deltaxi = coordinates[i][0] - p1[0];
            int deltayi = coordinates[i][1] - p1[1];
            if (deltax * deltayi - deltay * deltaxi != 0) { //计算二阶行列式
                return false;
            }
        }

        return true;
    }

}