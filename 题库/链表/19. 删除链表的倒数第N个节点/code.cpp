/*
 * @Author: MetGuo 
 * @Date: 2020-05-01 10:20:53 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-01 10:47:42
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

struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode *p=head, *q, *r=head; //p指向被删除节点，q指向p的前驱，r是p向后数第n个节点。
    int i;
    for(i=1; i<n && r!=NULL; i++){
        r = r->next;
    }
    if(r->next == NULL){ //此时删除的是第一个节点
        head = head->next;
        free(p);
        return head;
    }
    while(r->next!=NULL){
        q = p;
        p = p->next;
        r = r->next;
    }
    q->next = p->next;
    free(p);
    return head;

}


int main(int argc, char const *argv[])
{
    
    return 0;
}
