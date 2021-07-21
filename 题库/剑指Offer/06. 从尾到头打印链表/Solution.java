

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while(p != null) {
            list.add(p.val);
            p = p.next;
        }
        int size = list.size();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[size - i - 1] = list.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}