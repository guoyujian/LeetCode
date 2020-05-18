/*
 * @Author: MetGuo 
 * @Date: 2020-05-18 10:19:23 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-18 11:14:27
 */

#include <stdio.h>


void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int i,j,k,tmp=0; // tmp用来记录j的位置，每次从nums1的tmp位置开始向后查找
    for(i=0; i<nums2Size; i++){
        if(tmp == nums1Size-1){ //把nums2中的元素全部插入到nums1末尾
            for(j=tmp+1; i<nums2Size; i++, j++){
                nums1[j] = nums2[i];
            }
            break;
        }
        for(j=tmp; j<nums1Size; ){
            if(nums2[i]>=nums1[j]){ // 找到合适的位置
                j++;
                continue;
            }
            //向后移动nums1的元素，并插入nums2的元素
            for(k=nums1Size; k>=j; k--){
                nums1[k+1] = nums1[k];
            }
            nums1[j] = nums2[i];
            nums1Size++;
            tmp = j+1;
            break;
        }

    }
} //该算法在本地测试没问题，但是在Leetcode上报错……故请看Java的算法
/*AddressSanitizer: heap-buffer-overflow on address 0x603000000028 at pc 0x000000401b5b bp 0x7ffc04962190 sp 0x7ffc04962180
READ of size 4 at 0x603000000028 thread T0*/

int main(int argc, char const *argv[])
{
    int nums1[] = {1,2,3,0,0,0};
    int nums2[] = {2,5,6};
    merge(nums1, 3, 6, nums2, 3, 3);
    int i;
    for(i=0; i<6; i++){
        printf("%d\t", nums1[i]);
    }
    return 0;
}
