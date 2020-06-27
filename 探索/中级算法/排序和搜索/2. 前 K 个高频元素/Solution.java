

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.*;

/**
 * @Description 前 K 个高频元素
 * @Date 2020/6/27
 * @Created by 11599
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0 || nums.length == 0){
            int tmp[] = {};
            return tmp;
        }
        int res[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 0);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3,3,3,3};
        int[] ks = new Solution().topKFrequent(nums, 2);
        for (int k : ks) {
            System.out.println(k);
        }
    }

}
