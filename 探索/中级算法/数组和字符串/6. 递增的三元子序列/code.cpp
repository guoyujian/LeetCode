/*
 * @Author: 11599 
 * @Date: 2020-06-09 09:56:41 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-09 10:46:17
 */


#include <stdio.h>
#include <limits.h>

bool increasingTriplet(int* nums, int numsSize){
    if(numsSize < 3){
        return false;
    }
    int min = INT_MAX, mid = INT_MAX;
    int i;
    for(i=0; i<numsSize; i++){
        if(nums[i] <= min){ //这里是小于等于，并非小于
            min = nums[i];
        } else if(nums[i] <= mid){
            mid = nums[i];
        } else {
            return true;
        }
    }
    return false;
    
}//抄的：https://leetcode-cn.com/problems/increasing-triplet-subsequence/solution/c-xian-xing-shi-jian-fu-za-du-xiang-xi-jie-xi-da-b/

int main(){
    int nums[5] = {1,2,3,1,1};
    printf("%d", increasingTriplet(nums, 5));
    return 0;
}
