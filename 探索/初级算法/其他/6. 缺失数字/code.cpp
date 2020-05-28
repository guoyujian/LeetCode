/*
 * @Author: MetGuo 
 * @Date: 2020-05-29 07:07:00 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-29 07:12:19
 */


#include <stdio.h>


int missingNumber(int* nums, int numsSize){
    //原数列应该是0-numsSize
    int i, sum2 = 0;
    int sum1 = (0+numsSize) * (numsSize+1) / 2;
    for(i=0; i<numsSize; i++){
        sum2 += nums[i];
    }
    return sum1 - sum2;
}


/**
 * 推荐两种方法：1. 根据异或的性质b^b=0
 * 2. 求和相见
 * 不推荐：二分查找法
 */
int main(int argc, char const *argv[])
{
    
    return 0;
}
