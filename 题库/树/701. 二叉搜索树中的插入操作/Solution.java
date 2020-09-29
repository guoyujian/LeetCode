

import java.util.*;

/**
 * @Description 二叉搜索树中的插入操作
 * @Date 2020/9/30
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val, null, null);
        }
        TreeNode p = root;
        while(true) {
            if(val < p.val) {
                if(p.left == null) {
                    p.left = new TreeNode(val, null ,null);
                    break;
                } else {
                    p = p.left;
                }
            }
            if(val > p.val) {
                if(p.right == null) {
                    p.right = new TreeNode(val, null ,null);
                    break;
                } else {
                    p = p.right;
                }
            }

        }

        return root;
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