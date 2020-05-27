/*
 * @Author: MetGuo 
 * @Date: 2020-05-27 11:42:17 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-27 11:54:24
 */



#include <stdio.h>


bool isPowerOfThree(int n){
    if(n < 1){
        return false;
    }
    if(n == 1){
        return true;
    }
    return n%3 == 0 && isPowerOfThree(n/3);
} //进阶：不用循环或递归？


int main(int argc, char const *argv[])
{
    printf("%d", isPowerOfThree(1));
    return 0;
}
