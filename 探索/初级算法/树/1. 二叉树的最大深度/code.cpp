/*
 * @Author: MetGuo 
 * @Date: 2020-05-06 11:16:02 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-06 11:24:58
 */


#include <stdio.h>
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


int maxDepth(struct TreeNode* root){ // 递归
    if(root == NULL){
        return 0;
    } 
    int left_depth = maxDepth(root->left);
    int right_depth = maxDepth(root->right);
    if(left_depth >= right_depth){
        return left_depth+1;
    } else {
        return right_depth+1;
    }
}



int main(int argc, char const *argv[])
{
    
    return 0;
}
