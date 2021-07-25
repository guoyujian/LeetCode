
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
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) {
            head = head.next;
            return head;
        }
        ListNode q = head, p = head.next;
        while(p != null) {
            if(p.val == val) {
                q.next = p.next;
                return head;
            } else {
                q = p;
                p = p.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}