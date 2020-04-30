/*
 * @Author: MetGuo 
 * @Date: 2020-04-30 11:44:52 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-30 13:00:13
 */

#include <stdio.h>
#include <stdlib.h>
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode {
    int val;
    struct ListNode *next;
} *head;

void deleteNode(struct ListNode* node) { //node是要被删除的节点，不知道head
    struct ListNode* p = node->next;
    node->val = node->next->val;
    node->next = node->next->next;
    free(p);
}

int main(int argc, char const *argv[])
{
    
    return 0;
}
