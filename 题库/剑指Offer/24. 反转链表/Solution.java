

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
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //本质就是重新设置指针域的过程
        ListNode p = head, r = null, q; // p:遍历指针，r:p的前驱，q：p的后继
        while(p != null) {
            q = p.next;
            p.next = r;
            r = p;
            p = q;

        }
        return r;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}