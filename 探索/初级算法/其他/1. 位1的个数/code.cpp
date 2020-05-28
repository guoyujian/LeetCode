/*
 * @Author: MetGuo 
 * @Date: 2020-05-28 13:53:15 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-28 14:55:43
 */



#include <stdio.h>
#include <stdint.h>


int hammingWeight(uint32_t n) {
    int bits = 0;
    uint32_t mask = 1;
    int i;
    for(i=0; i<32; i++){
        if((n & mask) != 0){
            ++bits;
        }
        mask <<= 1;
    }
    return bits;
}//抄的官方题解
/**
 * 思想：mask只有一位1，用它和n进行按位与运算，得到的如果非0，则表明该位为1，依次类推
 */

int main(int argc, char const *argv[])
{
    uint32_t n = 00000000000000000000000000000001;
    uint32_t m = 00000000000000000000000000000010;
    printf("%d", n<<1);
    printf("%d", m);
    return 0;
}
