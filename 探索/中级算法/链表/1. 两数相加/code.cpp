/*
 * @Author: 11599 
 * @Date: 2020-06-10 10:28:49 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-10 12:20:34
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

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    if(l1 == NULL){
        return l2;
    } else if(l2 == NULL){
        return l1;
    }
    //l1!=NULL && l2!=NULL
    struct ListNode *l3 = NULL; //返回的链表
    struct ListNode *p=l1,
                *q=l2,
                *r1 = NULL, 
                *r2 = NULL; // p:l1的遍历指针；q:l2的遍历指针；r1:l3的遍历指针；r2:r1的前驱指针
    int flag = 0; // 进位标识符
    while (p || q || flag)
    {
        r1 = (struct ListNode *)malloc(sizeof(struct ListNode));
        r1->val = flag + (p?p->val:0) + (q?q->val:0); // 这两个括号必加否则结果不正确。涉及运算符的优先级问题。
        flag = r1->val /10;
        r1->val %= 10;
        r1->next = NULL;
        if(l3 == NULL){
            l3 = r1;
        } else {
            r2->next = r1;
        }
        r2 = r1;
        r1 = r1->next;
        if(p){
            p = p->next;
        }
        if(q){
            q = q->next;
        }
    }
    return l3;
}



int main(int argc, char const *argv[])
{
    struct ListNode *l1 = (struct ListNode *)malloc(sizeof(struct ListNode));
    l1->val = 2;
    l1->next = NULL;
    struct ListNode *l2 = (struct ListNode *)malloc(sizeof(struct ListNode));
    l2->val = 5;
    l2->next = NULL;
    struct ListNode *l3 = addTwoNumbers(l1, l2);
    printf("%d", l3->val);
    return 0;
}
