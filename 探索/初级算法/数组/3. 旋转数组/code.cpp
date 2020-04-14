/*
 *@Author: MetGuo 
 *@Date: 2020-04-13 17:43:59 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-13 20:56:11
 */
#include <stdio.h>

//主体方法
void rotate(int* nums, int numsSize, int k){
    /*
    //时间效率太差
    int i,j,temp;
    for(i=0; i<k; i++){
        temp = nums[numsSize-1];
        for(j=numsSize-1; j>0; j--){
            nums[j] = nums[j-1];
        }
        nums[0] = temp;
    }
    */
   
    /*
     *抄的：直接计算新的index值，下一次的调整基于上一个位置
     *currentIndex = newIndex 说明两个位置的元素相互交换完成，那直接往后推一位
     */
    int i=0, currNum=nums[0], currIndex=0, newIndex=0;
    if(numsSize<2 || k<1 || k%numsSize==0){
        return ;
    }
    while(i++ < numsSize){
        newIndex = (newIndex + k) % numsSize;
        int tmp = nums[newIndex];
        nums[newIndex] = currNum;
        if(currIndex != newIndex){
            currNum = tmp;
        } else {
            currNum = nums[++newIndex];
            ++currIndex;
        }
    }

    //还有其他方法待补充
    
   

}



//测试
int main(int argc, char const *argv[])
{
    int nums[] = {-1,-100,3,99};
    int numsSize = 4;
    int k = 2;
    rotate(nums, numsSize, k);
    int i;
    for(i = 0; i< numsSize; i++){
        printf("%d\t", nums[i]);   
    }
    return 0;
}
