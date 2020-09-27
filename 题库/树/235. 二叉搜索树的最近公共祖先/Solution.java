



/**
 * @Description 二叉搜索树的最近公共祖先
 * @Date 2020/9/26
 * @Created by gyj
 */


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution { //利用二叉搜索树的性质进行查找。
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode t = root;
        if(t == null) {
            return null;
        } //这一段应该是不需要的
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


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}