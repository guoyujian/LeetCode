#include <stdio.h>

//主体
int removeDuplicates(int* nums, int numSize){
    if(numSize==0){
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
