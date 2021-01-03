
import java.util.Arrays;

/**
 * @Description 86. 分隔链表
 * @Date 2021/1/3
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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;

/*        作者：LeetCode-Solution
        链接：https://leetcode-cn.com/problems/partition-list/solution/fen-ge-lian-biao-by-leetcode-solution-7ade/
        来源：力扣（LeetCode）
        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。*/
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}