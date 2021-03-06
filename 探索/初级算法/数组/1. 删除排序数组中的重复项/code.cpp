/*
 * @Author: MetGuo 
 * @Date: 2020-04-11 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-13 17:41:45
 */


#include <stdio.h>



//主体
int removeDuplicates(int* nums, int numSize){
    if(numSize==0){ //需要注意numSize=0的情况
        return 0;
    }
    int newLen = 0;
    int i;
    for(i=1; i<numSize; i++){
        if(nums[i-1] != nums[i]){
            nums[++newLen] = nums[i]; 
        }
    }

    return newLen+1;
}



//测试
int main(int argc, char const *argv[])
{
    int nums[] = {1};
    int numSize = 1;
    int newLen = removeDuplicates(nums, numSize);
    int i;
    for(i=0;i<newLen;i++){
        printf("%d\t", nums[i]);
    }
    return 0;
}
