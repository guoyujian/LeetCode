

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int numRow=1; numRow<=numRows; numRow++){
            Integer row[] = new Integer[numRow];//第numRow行，初始化numRow个元素
            row[0] = 1;
            row[numRow-1] = 1;
            for(int i=1; i<numRow-1; i++){
                row[i] = list.get(numRow-2).get(i-1) + list.get(numRow-2).get(i);
            }
            list.add(Arrays.asList(row));
        }
        return list;
    }




    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().generate(5);
        for(List<Integer> list1 : list){
            String str = "";
            for(Integer num : list1){
                str += num+" ";
            }
            System.out.println(str);
        }



    }
}
