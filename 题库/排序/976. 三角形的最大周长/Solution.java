

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description 976. 三角形的最大周长
 * @Date 2020/11/29
 * @Created by gyj
 */
class Solution {
    public int largestPerimeter(int[] A) {
        if(A.length < 3) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int num : A) {
            list.add(num);
        }
        Collections.sort(list);
        int max = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            int a = list.get(i);
            int b = list.get(i+1);
            int c = list.get(i+2);
            if(a + b <= c){
                continue;
            } else{
                max = Math.max(max, a+b+c);
            }
        }
        return max;
    }
}