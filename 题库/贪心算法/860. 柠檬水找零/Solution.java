


import java.util.ArrayList;
import java.util.List;

/**
 * @Description 860. 柠檬水找零
 * @Date 2020/12/10
 * @Created by gyj
 */
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] changes = new int[3]; // 存放零钱5，10，20的数量
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5) {
                changes[0]++;
                continue;
            } else if(bills[i] == 10) {
                changes[1]++;
                if(changes[0] > 0) {
                    changes[0]--;
                } else {
                    return false;
                }
            } else { //需要找零10*1+5*1 or 5*3
                changes[2]++;
                if(changes[1] > 0 && changes[0] > 0) {
                    changes[1]--;
                    changes[0]--;
                } else if(changes[1] <= 0) {
                    if(changes[0] < 3) {
                        return false;
                    } else {
                        changes[0] -= 3;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}