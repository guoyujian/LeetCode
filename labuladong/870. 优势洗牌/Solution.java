import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        Queue<int[]> queue = new PriorityQueue<>(
            (int[] pair1, int[] pair2) -> {
                return pair2[1] - pair1[1];
            }
        ); // 不能直接对nums2进行排序，所以使用一个优先级队列。
        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i, nums2[i]});
        }
        Arrays.sort(nums1);
        int left = 0, right = n - 1;
        int[] res = new int[n];
        while(!queue.isEmpty()) {
            int[] pair = queue.poll(); // nums2最大的元素
            int index = pair[0], val = pair[1];
            if(val >= nums1[right]) {
                res[index] = nums1[left]; //注意这里为什么用index
                left++;
            } else {
                res[index] = nums1[right];
                right--;
            }
        }
        return res;
    }
}