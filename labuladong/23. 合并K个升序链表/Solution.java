

import java.util.PriorityQueue;
import java.util.Queue;

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
    //难点在于，如何快速得到 k 个节点中的最⼩节点 -> 使用优先级队列
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)   return null;
        ListNode dummy = new ListNode(-1), p = dummy;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (a, b) -> {
            return a.val - b.val;
        }); // 优先出队的始终是最小的node
        for (ListNode head : lists) {
            if(head != null) {
                queue.add(head);
            }
        }

        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            if(node.next != null) {
                queue.add(node.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}