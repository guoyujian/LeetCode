/*
 * @Author: MetGuo 
 * @Date: 2020-05-17 11:09:27 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-17 11:32:58
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

struct TreeNode* sortedArrayToBST1(int* nums, int start, int end){
    if(start>end){
        return NULL;
    }
    int mid = (start+end)/2;
    struct TreeNode* node =(struct TreeNode*) malloc(sizeof(struct TreeNode));
    node->val = nums[mid];
    node->left = sortedArrayToBST1(nums, start, mid-1);
    node->right = sortedArrayToBST1(nums, mid+1, end);
    return node;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    if(nums==NULL || numsSize == 0){
        return NULL;
    }
    return sortedArrayToBST1(nums, 0, numsSize-1);
} // 基本是抄的。。但是思想还是能看懂



int main(int argc, char const *argv[])
{
    
    return 0;
}
