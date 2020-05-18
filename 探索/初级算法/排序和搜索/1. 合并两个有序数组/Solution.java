
import java.util.*;

/**
 * @Classname Solution
 * @Date 2020/5/18 11:15
 * @Created by 11599
 */

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

    }

}
