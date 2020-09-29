


import java.util.*;

/**
 * @Description 二叉树的后序遍历
 * @Date 2020/9/29
 * @Created by gyj
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode p = root;
        int flag = 0;
        if(p == null) {
            return res;
        }
        do{
            while(p != null) {
                stack1.push(p);
                stack2.push(0);
                p = p.left;
            }
            p = stack1.pop();
            flag = stack2.pop();
            if(flag == 0) {
                stack1.push(p);
                stack2.push(1);
                p = p.right;
            } else {
                res.add(p.val);
                p = null;
            }
        } while(!(p==null && stack1.isEmpty()));
        return res;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}