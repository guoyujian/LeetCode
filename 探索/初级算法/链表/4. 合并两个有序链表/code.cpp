/*
 * @Author: MetGuo 
 * @Date: 2020-05-03 09:48:07 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-03 10:26:53
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


struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *head, *p = l1, *q = l2 ,*r;
    if(p==NULL && q==NULL){
        return NULL;
    } else if(p==NULL){
        head = q;
        q = q->next;
    } else if(q==NULL){
        head = p;
        p = p->next;
    } else if(q->val > p->val){
        head = p;
        p = p->next;
    } else {
        head = q;
        q = q->next;
    } //这块判断容易糊涂
    r = head;
    while(p!=NULL && q!=NULL){
        if(p->val > q->val){
            r->next = q;
            q = q->next;
        } else {
            r->next = p;
            p = p->next;
        }
        r = r->next;
    }
    
    if(p==NULL){
        r->next = q;
    } else {
        r->next = p;
    }
    return head;
}


 
 int main(int argc, char const *argv[])
 {
     
     return 0;
 }
 