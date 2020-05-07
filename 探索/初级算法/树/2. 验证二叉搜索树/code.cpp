/*
 * @Author: MetGuo 
 * @Date: 2020-05-07 09:48:46 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-07 10:13:32
 */


#include <stdio.h>
#include <limits.h>
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
};


bool isValidBST(struct TreeNode* root){
    if(root == NULL){
        return true;
    }
    return valid(root, LONG_MIN, LONG_MAX);
}

bool valid(struct TreeNode* root, long min, long max){
    if(root == NULL){
        return true;
    }
    if(root->val <= min || root->val >= max){
        return false;
    }
    return valid(root->left, min, root->val) && valid(root->right, root->val, max);
} //抄的，递归没想明白

//另外一种方法:中序遍历，得到的数组如果不是小->大的顺序，则不是二叉搜索树



int main(int argc, char const *argv[])
{
    
    return 0;
}
