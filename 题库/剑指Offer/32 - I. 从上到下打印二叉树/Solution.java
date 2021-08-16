


/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
**/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null) {
            return new int[]{};
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        do{
            TreeNode p = queue.poll();
            if(p.left != null) {
                queue.offer(p.left);
            }
            if(p.right != null) {
                queue.offer(p.right);
            }
            list.add(p.val);
        } while(!queue.isEmpty());
        int[] orders = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            orders[i] = list.get(i);
        }
        return orders;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}