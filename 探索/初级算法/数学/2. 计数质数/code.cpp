/*
 * @Author: MetGuo 
 * @Date: 2020-05-26 23:22:28 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-26 23:55:04
 */



#include <stdio.h>

bool isPrimes(int n){ // 是否是质数
    if(n < 2){
        return false;
    }
    if(n == 2){
        return true;
    }
    int i;
    for(i=2; i<= n/2 + 1; i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;
}


int countPrimes(int n){
    int i, count = 0;
    for(i=2; i<n; i++){
        if(isPrimes(i)){
            count++;
        }
    }
    return count;
} // 超时了。。


int main(int argc, char const *argv[])
{
    printf("%d", countPrimes(10));
    return 0;
}
