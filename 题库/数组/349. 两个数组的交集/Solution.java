


import java.util.*;

/**
 * @Description 349. 两个数组的交集
 * @Date 2020/11/2
 * @Created by gyj
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 < len2) {
            Arrays.sort(nums2);
            for (int i = 0; i < nums1.length; i++) {
                if(Arrays.binarySearch(nums2, nums1[i]) >= 0) {
                    set.add(nums1[i]);
                }
            }
        } else {
            Arrays.sort(nums1);
            for (int i = 0; i < nums2.length; i++) {
                if(Arrays.binarySearch(nums1, nums2[i]) >= 0) {
                    set.add(nums2[i]);
                }
            }
        }
        int[] res = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int i = 0;
        while(it.hasNext()) {
            res[i++] = it.next();
        }
        return res;
    }


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] nums = null;
        set.add(1);
        set.add(5);
        Object[] objects = set.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

    }
}