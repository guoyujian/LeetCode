

import java.util.*;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list = new ArrayList<>();
        ListNode p = headA;
        while(p != null) {
            list.add(p);
            p = p.next;
        }
        p = headB;
        while(p != null) {
            if(list.contains(p)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}