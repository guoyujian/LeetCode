/*
 * @Author: MetGuo 
 * @Date: 2020-05-28 21:55:46 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-28 21:59:44
 */



#include <stdio.h>
int hammingDistance(int x, int y){
    int z = x ^ y;
    int i, distance = 0;
    while(z != 0){
        if(z % 2 != 0){
            ++distance;
        }
        z /= 2;
    }
    return distance;
}// 按位异或，再计数1的个数



int main(int argc, char const *argv[])
{
    
    return 0;
}
