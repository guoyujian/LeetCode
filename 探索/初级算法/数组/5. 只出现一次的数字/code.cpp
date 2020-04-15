/*
 * @Author: MetGuo 
 * @Date: 2020-04-15 10:45:19 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-15 10:53:47
 */
#include <stdio.h>

/*
    没做过类似的还真想不到
    无论是先排序在比较，还是利用Set集合不重复的特点，都不能满足算法要求“线性的时间复杂度和不使用额外的空间”
    正解是，利用亦或
*/


int singleNumber(int* nums, int numsSize){
    int i,num=0;
    for(i=0; i<numsSize; i++){
        num = num ^ nums[i];
    }
    return num;
}




int main(int argc, char const *argv[])
{
    int nums[] = {4,1,1,2,2,3,5,5,3};
    int numsSize = 3;
    printf("%d", singleNumber(nums, numsSize));
    
    return 0;
}
