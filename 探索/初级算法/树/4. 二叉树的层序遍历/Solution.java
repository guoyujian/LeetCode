package patterns.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/9 16:34
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        if(root == null){
            return list1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // 先把根节点添加到队列中
        //读这个队列里所有元素，
        //将所有元素出队，再依次将所有元素的左右子节点入队（这里需要设置一个缓冲队列）
        //重复以上两步，直到队列为空
        while(!queue.isEmpty()){
            List<Integer> list2 = new ArrayList<>();
            for(TreeNode node : queue){
                list2.add(node.val);
            }
            list1.add(list2);
            Queue<TreeNode> tmp = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    tmp.offer(node.left);
                }
                if(node.right!=null){
                    tmp.offer(node.right);
                }
            }
            queue.addAll(tmp);
        }
        return list1;
    }


    public static void main(String[] args) {

    }

}
