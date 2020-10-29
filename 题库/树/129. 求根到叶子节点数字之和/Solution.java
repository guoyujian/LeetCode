import java.util.*;

/**
 * @Description 求根到叶子节点数字之和
 * @Date 2020/10/29
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
    public int sumNumbers(TreeNode root) {
        TreeNode p = root;
        int res = 0, num = 0;
        boolean flag;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Boolean> st2 = new Stack<>();
        if(p == null) {
            return 0;
        }
        do{
            while(p != null) {
                num = num * 10 + p.val;
                st1.push(p);
                st2.push(false);
                p = p.left;
            }
            p = st1.pop();
            flag = st2.pop();
            if(flag) {
                //adress
                if(p.left == null && p.right == null) {
                    res += num;
                }
                num /= 10;
                p = null;
            } else {
                st1.push(p);
                st2.push(true);
                p = p.right;
            }
        }while(!(p==null && st1.isEmpty()));

        return res;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

