

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description TODO
 * @Date 2020/6/14
 * @Created by 11599
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
    public List<Integer> inorderTraversal(TreeNode root) {//递归
        List<Integer> res = new ArrayList<>();
        this.helper(root, res);
        return res;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return ;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }


    public List<Integer> inorderTraversal1(TreeNode root) {//利用栈
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        if(p!=null){
            do{
                while(p!=null){
                    stack.push(p);
                    p = p.left;
                }
                p = stack.pop();
                res.add(p.val);
                p = p.right;
            }while(p!=null || !stack.isEmpty());
        }
        return res;
    }

    public static void main(String[] args) {

    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}