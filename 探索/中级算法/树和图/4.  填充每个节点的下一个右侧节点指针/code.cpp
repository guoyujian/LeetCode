/*
 * @Author: 11599 
 * @Date: 2020-06-17 13:59:36 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-17 14:01:40
 */


#include <stdio.h>
#include <stdlib.h>

/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *left;
 *     struct Node *right;
 *     struct Node *next;
 * };
 */

struct Node {
    int val;
    struct Node *left;
    struct Node *right;
    struct Node *next;
};


struct Node* connect(struct Node* root) {
	    preOrder(root);
        return root;
}

void preOrder(struct Node* node){
    if(node == NULL){
        return ;
    }
    //访问root
    if(node->left != NULL){
        node->left->next = node->right;
    }
    if(node->right != NULL && node->next != NULL){
        node->right->next = node->next->left;
    }
    preOrder(node->left);
    preOrder(node->right);
}

int main(int argc, char const *argv[])
{
    
    return 0;
}
