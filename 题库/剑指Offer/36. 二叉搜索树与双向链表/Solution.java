

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    List<Node> list = new ArrayList<>();
    public Node treeToDoublyList(Node root) { // 标准答案更快更简洁。
        inOrder(root);
        if(list.isEmpty()) {
            return null;
        }
        Node head = list.get(0);
        if(list.size() == 1) {
            head.left = head;
            head.right = head;
            return head;
        }
        head.right = list.get(1);
        head.left = list.get(list.size()-1);
        for (int i = 1; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i+1);
            list.get(i).left = list.get(i-1);
        }
        list.get(list.size()-1).left = list.get(list.size()-2);
        list.get(list.size()-1).right = head;
        return head;
    }

    private void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root);
        inOrder(root.right);
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}