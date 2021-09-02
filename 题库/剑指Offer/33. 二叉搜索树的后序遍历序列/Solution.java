

class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return helper(postorder, 0, postorder.length - 1);
    }

    private boolean helper(int[] postorder, int i, int j) {
        if(i >= j) {
            return true;
        }
        //根据根节点划分左右子树
        int p = i;
        while(postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]) {
            p++;
        }
        //递归检查左右子树。
        return p == j && helper(postorder, i, m-1) && helper(postorder, m, j-1);
    }
}