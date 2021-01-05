import java.util.ArrayList;
import java.util.List;

/**
 * @Description 830. 较大分组的位置
 * @Date 2021/1/5
 * @Created by gyj
 */
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            char tmp = s.charAt(i);
            int j = i;
            for(; j < s.length() && s.charAt(j) == tmp; j++);
            if(j-i >= 3) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j-1);
                res.add(list);
            }
            i = j;
        }
        return res;
    }

}