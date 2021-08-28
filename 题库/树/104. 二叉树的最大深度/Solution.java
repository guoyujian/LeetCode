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
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    private int depth(TreeNode p) {
        if(p == null) {
            return 0;
        }
        return 1 + Math.max(depth(p.left), depth(p.right));
    }
}