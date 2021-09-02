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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode t = root;
        //根据二叉搜索树的特性。
        if(t == null) { 
            return null;
        }
        if(p.val < t.val && q.val < t.val) {
            return lowestCommonAncestor(t.left, p, q);
        } else if(p.val > t.val && q.val > t.val) {
            return lowestCommonAncestor(t.right, p, q);
        } else if((p.val > t.val && q.val < t.val)
                || ((p.val < t.val && q.val > t.val))) {
            return t;
        } else if(p == t){
            return p;
        } else if(q == t) {
            return q;
        }
        return root;
    }
}