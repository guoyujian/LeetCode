

/**
 * @Description 328. 奇偶链表
 * @Date 2020/11/13
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            //当节点个数为0，1，2时，不必修改，直接返回。
            return head;
        }
        ListNode p = head, q = p.next, h1 = q, r = null;
        int i=0;
        while(p != null && q != null) {
            if(i % 2 == 0) {
                p.next = q.next;
                r = p;
                p = q.next;
            } else {
                q.next = p.next;
                q = p.next;
            }
            i++;
        }
        if(p != null) {
            p.next = h1;
        } else if( p == null) {
            r.next = h1;
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