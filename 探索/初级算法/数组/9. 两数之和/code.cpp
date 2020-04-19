/*
 * @Author: MetGuo 
 * @Date: 2020-04-19 09:47:49 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-19 10:01:26
 */


#include <stdio.h>
#include <stdlib.h>


/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int *returns = NULL;
    *returnSize = 0;
    int i,j;
    for(i=0; i<numsSize; i++){
        int tmp = target - nums[i];
        for(j=i+1; j<numsSize; j++){
            if(tmp == nums[j]){
                returns = (int *) malloc(sizeof(int) * 2);
                returns[0] = i;
                returns[1] = j;
                *returnSize = 2;
                return returns;
            }
        }
    }
    return returns;

}

 
int main(int argc, char const *argv[])
{
    int nums[] = {2, 7, 11, 15};
    int numsSize = 4;
    int target = 9;
    int returnSize = 0;
    int *indexes = twoSum(nums, numsSize, target, &returnSize);
    printf("%d\t%d", indexes[0], indexes[1]);
    return 0;
}
