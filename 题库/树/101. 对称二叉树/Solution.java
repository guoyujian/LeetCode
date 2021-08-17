

/**
 * @Description
 * @Date 2021/7/21
 * @Created by 11599
 **/
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
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : isMirrored(root.left, root.right);
    }

    private static boolean isMirrored(TreeNode left, TreeNode right) {
        if(left == null && right == null)   return true;
        if(left == null || right == null || left.val != right.val)  return false;
        return isMirrored(left.left, right.right) && isMirrored(left.right, right.left);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}