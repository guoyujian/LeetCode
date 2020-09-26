package patterns.observer;



/**
 * @Description 路径总和 II
 * @Date 2020/9/26
 * @Created by gyj
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();//存放遍历的节点
        Stack<Integer> stack2 = new Stack<>();//存放每个节点是否应当被访问的flag的值
        Stack<Integer> stack3 = new Stack<>(); //存放节点的值
        TreeNode p = root;
        int flag = 0;
        if(p == null ){
            return res;
        }
        do{
            while(p!=null) {
                stack1.push(p);
                stack2.push(0);
                stack3.push(p.val);
                p = p.left;
            }
            p = stack1.pop();
            flag = stack2.pop();
            if(flag == 0) {
                stack1.push(p);
                stack2.push(1);
                p = p.right;
            } else {
                //visit
                if(p.left == null && p.right == null) { // 只考虑叶子节点
                    int now_sum = 0;
                    for(Integer num : stack3) {
                        now_sum += num;
                    }
                    if(now_sum == sum) {
                        res.add(new ArrayList<>(stack3));
                    }
                }
                p = null;
                stack3.pop();
            }
        }while(!(p==null && stack1.isEmpty()));

        return res;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}