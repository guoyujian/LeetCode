
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 147. 对链表进行插入排序
 * @Date 2020/11/20
 * @Created by gyj
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        //p:已排序好的最后一个元素指针
        //q:遍历指针，找到插入的位置
        //r:q的前驱
        //s:p的后继，即待排序的节点指针
        //t:s的后继，即待排序节点的后一个元素指针
        if(head == null) {
            return head;
        }
        ListNode p = head, s = p.next;
        while(s != null) {
            ListNode q = head, r = null, t = null;
            while(q != s && q.val < s.val) {
                r = q;
                q = q.next;
            }
            if(q == s) {
                p = s;
                s = s.next;
                continue;
            }
            if(q == head) {
                head = s;
            } else {
                r.next = s;
            }
            t = s.next;
            s.next = q;
            p.next = t;
            s = t;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}