/*
 * @Author: MetGuo 
 * @Date: 2020-04-22 10:58:33 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-22 13:21:20
 */

#include <stdio.h>


/**
 * 炒的，但其实不难，唯一没想到如何当结果溢出时，返回0
 * 方法就是定义long类型
 */

int reverse(int x){

    const int int_max=0x7fffffff;
    const int int_min=0x80000000;
    long answer = 0;

    while(x!=0){
        answer = answer*10 + x%10;
        x /= 10;
    }
    if(answer<int_min || answer>int_max){
        return 0;
    }
    return answer;
}



int main(int argc, char const *argv[])
{
    int x= -789;
    printf("%d", reverse(x));
    return 0;
}
