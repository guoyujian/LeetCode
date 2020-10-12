

import java.util.*;

/**
 * @Description 二叉搜索树节点最小距离
 * @Date 2020/10/12
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
public class Solution {
    public int minDiffInBST(TreeNode root) {
        return myfunc(root, Integer.MAX_VALUE);
    }

    private int myfunc(TreeNode root, int num) {
        if(root == null || (root.left == null && root.right == null)) {
            return num;
        }
        if(root.left != null) {
            TreeNode p = root.left;
            while (p.right != null) {
                p = p.right;
            }
            num = Math.min(root.val-p.val, num);
        }
        if(root.right != null) {
            TreeNode p = root.right;
            while (p.left != null) {
                p = p.left;
            }
            num = Math.min(p.val-root.val, num);
        }
        int num1 = myfunc(root.left, num);
        int num2 = myfunc(root.right, num);
        return Math.min(num1, num2);
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}