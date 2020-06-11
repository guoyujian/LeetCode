/*
 * @Author: 11599 
 * @Date: 2020-06-11 14:08:27 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-11 14:29:23
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
};

struct ListNode* oddEvenList(struct ListNode* head){
    if(head == NULL || head->next == NULL || head->next->next == NULL){
        //当节点个数为0，1，2时，不必修改，直接返回。
        return head;
    }
    //节点数大于三
    struct ListNode* evenStart = head->next; // 第二个节点指针。
    struct ListNode* p = head, *q = head->next; // p遍历指针,q是p的后继。
    int flag = 1;
    while(p && q && q->next){
        p->next = q->next;
        p = q;
        q = q->next;
        ++ flag;
    }
    if(flag%2){ // 奇数
        p->next = evenStart;
        q->next = NULL;
    } else {
        q->next = evenStart;
        p->next = NULL;
    }
    return head;
}

int main(int argc, char const *argv[])
{
    
    return 0;
}
