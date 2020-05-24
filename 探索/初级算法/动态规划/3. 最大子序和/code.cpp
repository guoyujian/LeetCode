/*
 * @Author: MetGuo 
 * @Date: 2020-05-24 11:55:10 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-24 12:17:59
 */


#include <stdio.h>
#include <stdlib.h>

int maxSubArray(int* nums, int numsSize){
    int *results = (int *) malloc(sizeof(int) * numsSize);
    int i, maxSum = nums[0];
    for(i=0; i<numsSize; i++){
        results[i] = nums[i];
    } // 赋值数组nums
    for(i=1; i<numsSize; i++){
        if(nums[i]>0){
            results[i] = results[i-1] + nums[i];
        }
        if(results[i] > maxSum){
            maxSum = results[i];
        }
    }
    return maxSum;
}

/**
 * 抄的：
 * 动态规划，用result[i]保存以数字nums[i]结尾的最大子序和，然后不断更新result数组的最大值即可。总的时间复杂度O(n)
 * 代码有不太懂的地方……
 */


int main(int argc, char const *argv[])
{
    
    return 0;
}
