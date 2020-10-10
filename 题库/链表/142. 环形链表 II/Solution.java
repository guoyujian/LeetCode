


import java.util.*;

/**
 * @Description 环形链表 II
 * @Date 2020/10/07
 * @Created by gyj
 */
/**
 /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) { //没问题，就是时间效率太差
        if(head == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode p = head;
        list.add(p);
        while(true) {
            p = p.next;
            if(p!=null) {
                if(!list.contains(p)) {
                    list.add(p);
                } else {
                    return p;
                }
            } else {
                return null;
            }
        }
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