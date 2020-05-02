/*
 * @Author: MetGuo 
 * @Date: 2020-05-02 09:45:11 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-02 09:54:43
 */


#include <stdio.h>


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

struct ListNode* reverseList(struct ListNode* head){
    struct ListNode *p, *q, *r; // q是需要反转的节点，p是q的前驱，r是q的后继
    q = head;
    p = NULL;
    while(q != NULL){
        r = q->next;
        q->next = p;
        p = q;
        q = r;
    }
    return p;
} //自己做的，执行效率不错。其实就是反转节点的next指针。



int main(int argc, char const *argv[])
{
    
    return 0;
}
