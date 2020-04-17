/*
 * @Author: MetGuo 
 * @Date: 2020-04-17 12:40:28 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-17 14:15:20
 */



#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

/*
我能想到的两种思路，第一种直接操作数组，模拟整型的数值运算
第二种，先把数组转换成整型数字，加一之后，再转换为数组，这种方法位数较大会溢出。
*/
int* plusOne(int* digits, int digitsSize, int* returnSize){
    int* nums = (int *)malloc(sizeof(int) * (digitsSize+1));
    int i;
    for(i=0; i<digitsSize; i++){
        nums[i] = 0;
    }
    nums[digitsSize] = 1;
    for(i=digitsSize; i>0; i--){
        nums[i] += digits[i-1];
        if(nums[i] == 10){
            nums[i] = 0;
            nums[i-1] = 1;
        }
    }
    if(nums[0] == 1){ //进位了
        *returnSize = digitsSize+1;
        return nums;
    } else {
        *returnSize = digitsSize;
        return nums+1;
    }
}/*经测试，是空间复杂度比较优秀*/



int main(int argc, char const *argv[])
{
    int i;
    int digits[] = {1,2,3};
    int digitsSize = 3;
    int returnSize =0;
    int *returnDigits = plusOne(digits, digitsSize, &returnSize);
    for(i=0; i<returnSize; i++){
        printf("%d\t", returnDigits[i]);
    }
    return 0;
}
