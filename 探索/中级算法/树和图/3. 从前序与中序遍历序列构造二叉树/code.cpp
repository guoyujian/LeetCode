/*
 * @Author: 11599 
 * @Date: 2020-06-16 16:07:31 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-16 17:51:38
 */


#include <stdio.h>
#include <stdlib.h>

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

//找到item在中序遍历中的位置
int searchPos(int item, int* inorder, int inorderSize){
    int i;
    for (i = 0; i < inorderSize; i++)
    {
        if(item == inorder[i]){
            return i+1;
        }
    }

}


void insertItem(int item, int* inorder, int inorderSize, struct TreeNode *T){
    int ord;
    struct TreeNode *p, *q;
    p = (struct TreeNode *) malloc (sizeof(struct TreeNode));
    p->val = item;
    p->left = NULL;
    p->right = NULL;

    if(T == NULL){
        T = p;
        return ; 
    }
    ord = searchPos(item, inorder, inorderSize);
    q = T;
    while(1){
        if(ord < searchPos(q->val, inorder, inorderSize)){
            if(q->left != NULL){
                q = q->left;
            } else {
                q->left = p;
                break;
            }
        } else {
            if(q->right != NULL){
                q = q->right;
            } else {
                q->right = p;
                break;
            }
        }
    }
}






struct TreeNode* buildTree(int* preorder, int preorderSize, int* inorder, int inorderSize){
    struct TreeNode *T = NULL;
    int i;
    for(i=0; i<preorderSize; i++){
        insertItem(preorder[i], inorder, inorderSize, T);
    }
    return T;
} /* 本方法返回为空，暂不清楚原因，正确答案请参考Solution.java */



int main(int argc, char const *argv[])
{
    
    return 0;
}
