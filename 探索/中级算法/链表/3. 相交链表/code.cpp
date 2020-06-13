/*
 * @Author: 11599 
 * @Date: 2020-06-13 10:30:15 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-13 10:37:14
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


struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if(headA == NULL || headB == NULL){
        return NULL;
    }
    struct ListNode *pa = headA, *pb = headB;
    while(pa != pb){
        pa = pa?pa->next:headB;
        pb = pb?pb->next:headA;
    }
    return pa;
} //抄的https://leetcode-cn.com/problems/intersection-of-two-linked-lists/solution/tu-jie-xiang-jiao-lian-biao-by-user7208t/

//思路是：两个指针分别遍历headA和headB，遍历完再遍历另一个链表，以此消除长度差，当指针相同时，即为相交的节点。

int main(int argc, char const *argv[])
{
    
    return 0;
}
