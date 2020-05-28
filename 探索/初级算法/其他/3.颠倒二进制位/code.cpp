/*
 * @Author: MetGuo 
 * @Date: 2020-05-28 22:11:11 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-28 22:20:56
 */


#include <stdio.h>
#include <stdint.h>


uint32_t reverseBits(uint32_t n) {
    int i;
    uint32_t result = 0;
    for(i=0; i<32; i++){
        result |= ((n>>i) & 1) << (31-i);
    }
    return result;
}//抄的，法一
/**
 * 两种方法
 * 第一种，从右向左每次取一位， 移动到结果数上
 * 第二种，先前16位和后16位调换，再前8位和后八位调换。。
 */

int main(int argc, char const *argv[])
{
    

    return 0;
}
