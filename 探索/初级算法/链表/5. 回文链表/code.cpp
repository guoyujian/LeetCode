/*
 * @Author: MetGuo 
 * @Date: 2020-05-04 11:28:00 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-04 11:57:28
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

bool isPalindrome(struct ListNode* head){
    struct ListNode *p = head;
    int len = 0;
    int i;
    while(p!=NULL){
        p = p->next;
        len ++; 
    }
    int *nums = (int *)malloc(sizeof(int) * len);
    for(p=head, i=0; p!=NULL; p = p->next, i++){
        nums[i] = p->val;
    }

    for(i=0; i<len/2; i++){
        if(nums[i] != nums[len-1-i]){
            return false;
        }
    }
    return true;



}


int main(int argc, char const *argv[])
{
    
    return 0;
}
