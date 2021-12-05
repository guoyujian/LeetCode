

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //快慢指针
        ListNode slow, fast;
        slow = fast = head;
        while(n-- > 0) {
            fast = fast.next;
        }
        if(fast == null) { //如果此时fast为null，则说明head为倒数第n个节点
            return head.next;
        }
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //删除slow.next节点
        slow.next = slow.next.next;
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