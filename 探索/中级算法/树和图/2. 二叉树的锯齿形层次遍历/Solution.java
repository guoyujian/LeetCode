
/**
 * @Description 二叉树的锯齿形层次遍历
 * @Date 2020/6/15
 * @Created by 11599
 */

import java.util.*;

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

    //层次遍历
//    public void levelOrder(TreeNode root) {
//        if(root == null){
//            return ;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            TreeNode node = queue.poll();
//            //访问node：略
//            if(node.left != null){
//                queue.offer(node.left);
//            }
//            if(node.right != null){
//                queue.offer(node.right);
//            }
//        }
//    }
    //先写出层次遍历，再根据层次遍历修改
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        int level = 1;
        queue.offer(root);
        while(!queue.isEmpty()){
            //先遍历队列中的元素，level为奇数时从队头开始，level为偶数时从队尾开始
            List<Integer> list = new ArrayList<>();
            if(level % 2 != 0){ // 奇数
                for (TreeNode treeNode : queue) {
                    list.add(treeNode.val);
                }
            } else { //偶数
                for (TreeNode treeNode : queue) {
                    list.add(0, treeNode.val); // 始终在第一个位置插入，以实现倒置。
                }
            }
            res.add(list);
            int size = queue.size(); // 记录当前队列的size
            for (int i = 0; i < size; i++) { // 将【当前】队列元素清空，再放入元素
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            level++;
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

