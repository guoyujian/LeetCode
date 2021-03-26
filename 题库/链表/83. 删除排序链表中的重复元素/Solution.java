package patterns.observer;

import java.util.Arrays;

/**
 * @Description 83. 删除排序链表中的重复元素
 * @Date 2021/3/26
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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null) {
            if(p.next == null) {
                return head;
            }
            if(p.next.val == p.val) {
                ListNode q = p.next;
                p.next = q.next;
                //释放q的内存空间
            } else {
                p = p.next;
            }
        }
        return null;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}