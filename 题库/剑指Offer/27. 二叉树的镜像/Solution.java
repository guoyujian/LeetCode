

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
    public TreeNode mirrorTree(TreeNode root) {
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}