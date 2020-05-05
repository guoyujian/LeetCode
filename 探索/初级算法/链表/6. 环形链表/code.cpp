/*
 * @Author: MetGuo 
 * @Date: 2020-05-05 16:34:05 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-05 16:45:06
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


bool hasCycle(struct ListNode *head) {
    if(head == NULL || head->next == NULL){
        return false;
    }
    struct ListNode *fast=head ,*slow=head;
    while(fast->next!=NULL && fast->next->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast){
            return true;
        }
    }
    return false;
} //抄的：设置快慢两个指针，如果快指针和慢指针最终相遇，则说明有环。

int main(int argc, char const *argv[])
{
    
    return 0;
}
