

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description 二叉树的序列化与反序列化
 * @Date 2020/7/9
 * @Created by 11599
 * 本题目中序列化后的格式不限。只要你能把你序列化后的字符串重新反序列化成一颗二叉树都是可以的。
 */

/*
抄的官方题解：使用先序遍历进行序列化和反序列化。其他思路：层次遍历，或者 中序、后续遍历。
链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/solution/er-cha-shu-de-xu-lie-hua-yu-fan-xu-lie-hua-by-le-2/
PS:执行为0ms的答案太赖了
 */
public class Codec {

    public String rserialize(TreeNode root, String str) {
        if (root == null) {
            str += "None,";
        } else {
            str += str.valueOf(root.val) + ",";
            str = rserialize(root.left, str);
            str = rserialize(root.right, str);
        }
        return str;
    }

    public String serialize(TreeNode root) {
        return rserialize(root, "");
    }

    public TreeNode rdeserialize(List<String> l) {
        if (l.get(0).equals("None")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);

        return root;
    }

    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
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