


/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
    public List<List<Integer>> pathSum0(TreeNode root, int target) {
        //后续遍历
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Boolean> s2 = new Stack<>();
        TreeNode p = root;
        if(p == null) {
            return res;
        }
        do{
            while(p != null) {
                s1.push(p);
                s2.push(false);
                p = p.left;
            }
            p = s1.pop();
            boolean flag = s2.pop();
            if(!flag) {
                s1.push(p);
                s2.push(true);
                p = p.right;
            } else {
                //visit
                if(p.left == null && p.right == null) {
                    int sum = 0;
                    List<Integer> list = new ArrayList<>();
                    for (TreeNode node : s1) {
                        sum += node.val;
                        list.add(node.val);
                    }
                    if(sum + p.val == target) {
                        list.add(p.val);
                        res.add(list);
                    } else {
                        list.clear();
                    }
                }
                p = null;
            }
        } while(!(p==null && s1.isEmpty()));
        return res;
    }

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();


    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    private void recur(TreeNode node, int target) {
        if(node == null) {
            return;
        }
        path.add(node.val);
        target -= node.val;
        if(target == 0 && node.left == null && node.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(node.left, target);
        recur(node.right, target);
        path.removeLast();
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