/*
 * @Author: MetGuo 
 * @Date: 2020-04-16 14:15:23 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-16 15:00:51
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* intersect(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize){
    *returnSize = 0;
    int* returnNums = NULL;
    if(nums1Size ==0 || nums2Size == 0){
        return returnNums;
    }
    int flags[nums1Size]; // 标志nums1的元素是否是交集元素
    int i,j;

    for(i=0; i<nums1Size; i++){ // 初始化
        flags[i] = 0;
    }
    for(i=0; i<nums2Size; i++){
        for(j=0; j<nums1Size; j++){
            if(nums2[i] == nums1[j] && flags[j] == 0) {
                flags[j] = 1;
                (*returnSize)++;
                break; // 注意这里
            }
        }
    }
    returnNums = (int*)malloc(sizeof(int)*(*returnSize));
    j=0;
    for(i=0; i<nums1Size; i++){
        if(flags[i] == 1){
            returnNums[j++] = nums1[i];
        }
    }
    
    return returnNums;

}



int main(int argc, char const *argv[])
{
    int nums1[] = {1,2,2,1};
    int nums1Size=4;
    int nums2[] = {2};
    int nums2Size=1;
    int returnSize = 0;
    int *returnNums = intersect(nums1, nums1Size, nums2, nums2Size, &returnSize);
    int i;
    for(i=0; i<returnSize; i++){
        printf("%d\t", *(returnNums+i));
    }
    free(returnNums);
    return 0;
}
