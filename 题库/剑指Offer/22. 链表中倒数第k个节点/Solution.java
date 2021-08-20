

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
 **/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head, q = null;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        q = head;
        while(p != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}