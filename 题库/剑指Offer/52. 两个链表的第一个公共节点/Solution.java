

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
    public ListNode getIntersectionNode0(ListNode headA, ListNode headB) {
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
    //双指针解法，better
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) {
        return null;
    }
    ListNode p = headA;
    ListNode q = headB;
    while(p != q) {
        p = p == null ? headB : p.next;
        q = q == null ? headA : q.next;
    }
    return p;
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