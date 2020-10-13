


import java.util.*;

/**
 * @Description 两两交换链表中的节点
 * @Date 2020/10/13
 * @Created by gyj
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode p=head, q=null, r=null;
        p = head;
        head = p.next;
        while(p!=null) {
            q = p.next;
            if(q != null) {
                r = q.next;
            }
            q.next = p;
            if(r != null && r.next != null) {
                p.next = r.next;
            } else {
                p.next = r;
                break;
            }
            p = r;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}