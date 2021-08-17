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
    public TreeNode invertTree(TreeNode root) {
        //先序遍历，反转左右节点
        reverseTree(root);
        return root;
    }
    private static void reverseTree(TreeNode root) {
        if(root == null) {
            return ;
        }
        TreeNode p = root.left;
        root.left = root.right;
        root.right = p;
        reverseTree(root.left);
        reverseTree(root.right);
    }
}