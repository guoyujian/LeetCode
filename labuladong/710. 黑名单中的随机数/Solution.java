

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Solution {
    private int sz; // n - blacklist.length
    // 将存在于[0, sz)的黑名单元素映射到[sz, n)，key是黑名单元素，value是索引值
    private Map<Integer, Integer> mapping;
    public Solution(int n, int[] blacklist) {
        sz = n - blacklist.length;
        mapping = new HashMap<>();
        for (int b : blacklist) {
            mapping.put(b, 0); // 先将所有黑名单元素放进去，value是多少都可以
        }
        int last = n - 1;
        for (int b : blacklist) {
            if(b >= sz) { //如果b已经在区间[sz, N)则直接忽略
                continue;
            }
            //跳过所有黑名单中的数字
            while(mapping.containsKey(last)) {
                last--;
            }
            mapping.put(b, last);
            last--;
        }
    }

    public int pick() {
        //随机选取一个索引
        int index = new Random().nextInt(sz);
        //如果这个索引命中了黑名单，则需要被映射到其他位置
        if(mapping.containsKey(index)) {
            return mapping.get(index);
        }
        return index;
    }

    public static void main(String[] args) {
        int index = new Random().nextInt(2);
        System.out.println(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */