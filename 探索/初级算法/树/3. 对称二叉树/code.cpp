/*
 * @Author: MetGuo 
 * @Date: 2020-05-08 10:51:33 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-08 12:50:13
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


bool isSymmetric(struct TreeNode* root){
    if(root == NULL){
        return true;
    }
    return symmetric(root->left, root->right);
}


bool symmetric(struct TreeNode *p, struct TreeNode *q){
    if(!p && !q)    return true;
    if(!p || !q)    return false;
    return (p->val == q->val) && symmetric(p->left, q->right) && symmetric(p->right, q->left);
}
//抄的，不想做了

int main(int argc, char const *argv[])
{
    

    return 0;
}
