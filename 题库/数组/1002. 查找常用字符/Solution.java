

import java.util.*;

/**
 * @Description 查找常用字符
 * @Date 2020/10/14
 * @Created by gyj
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        char[] keys = null;
        int[] values = null;
        if(A == null || A.length == 0) {
            return list;
        }
        for(int i = 0; i< A.length; i++) {
            char[] chs = A[i].toCharArray();
            Arrays.sort(chs);
            if(i == 0) {
                values = new int[chs.length];
                keys = Arrays.copyOf(chs,chs.length); // 不用复制直接指向chs应该也可以
                Arrays.fill(values, 1);
            } else {
                int j = 0, k = 0;
                while(j < keys.length && k < chs.length) {
                    if(chs[k] > keys[j]) {
                        j++;
                        continue;
                    } else if(chs[k] == keys[j]) {
                        values[j] ++;
                        j++;
                        k++;
                    } else {
                        k++;
                        continue;
                    }
                }
            }
        }
        for(int i = 0; i < values.length; i++) {
            if(values[i] == A.length) {
                list.add(String.valueOf(keys[i]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strs = {"cool","lock","cook"};
        List<String> list = new Solution().commonChars(strs);
        for(String str : list) {
            System.out.println(str);
        }
    }
}