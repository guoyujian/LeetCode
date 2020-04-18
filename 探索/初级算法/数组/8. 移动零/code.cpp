/*
 * @Author: MetGuo 
 * @Date: 2020-04-18 15:04:43 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-18 15:18:53
 */


#include <stdio.h>

void moveZeroes(int* nums, int numsSize){
    int i,k=0;
    for(i=0; i<numsSize; i++){
        if(nums[i] == 0){
            continue;
        } else {
            nums[k++] = nums[i];
        }
    }
    for(;k<numsSize;k++){
        nums[k] = 0;
    }
}


int main(int argc, char const *argv[])
{
    int nums[] = {1,2,0,3,0};
    int numsSize = 5;
    moveZeroes(nums, numsSize);
    int i;
    for(i=0; i<numsSize; i++){
        printf("%d\t", nums[i]);
    }
    return 0;
}
