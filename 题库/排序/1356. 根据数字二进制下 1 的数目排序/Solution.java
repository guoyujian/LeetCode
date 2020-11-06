


import java.util.*;

/**
 * @Description 根据数字二进制下 1 的数目排序
 * @Date 2020/11/06
 * @Created by gyj
 */
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Solution.numsOfBinaryInt(o1) != Solution.numsOfBinaryInt(o2) ?
                        Solution.numsOfBinaryInt(o1) - Solution.numsOfBinaryInt(o2) :
                        Math.subtractExact(o1, o2);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }

    private static int numsOfBinaryInt(int num) {
        int res = 0;
        while(num != 0){
            if((num & 1) != 0) {
                ++res;
            }
            num >>= 1;
        }
        return res;
    }
}

