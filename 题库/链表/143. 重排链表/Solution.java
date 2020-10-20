


import java.util.*;

/**
 * @Description 重排链表
 * @Date 2020/10/20
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
public class Solution { //时间效率不高，先这样了
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        if(head == null) {
            return;
        }
        ListNode p = head, q = null;
        while(p != null) {
            deque.addLast(p);
            p = p.next;
        }
        int i = 0;
        while(!deque.isEmpty()) {
            if(i % 2 == 0) {
                p = deque.pollFirst();
                if(deque.isEmpty()) { //如果弹出的是最后一个元素，则最后一个元素的next为null
                    p.next = null;
                }
            } else {
                q = deque.pollLast();
                if(p.next != q) {
                    q.next = p.next;
                    p.next = q;
                } else {
                    q.next = null;
                }

            }
            i++;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}