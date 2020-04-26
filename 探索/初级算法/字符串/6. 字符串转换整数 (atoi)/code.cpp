/*
 * @Author: MetGuo 
 * @Date: 2020-04-26 10:26:05 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-26 11:33:21
 */

#include <stdio.h>
#include <string.h>

int myAtoi(char * str){
    const int int_max = 0x7fffffff;
    const int int_min = 0x80000000;
    long num = 0;
    int i, digit = 1; //digit 正负符号位
    if(strlen(str) == 0)    return 0;
    for(i=0; i<strlen(str) && str[i] == ' '; i++);
    if(str[i]!='+' && str[i]!='-' && !(str[i]>='0'&&str[i]<='9'))   return 0;
    if(str[i] == '+'){
        if(str[++i]<'0' || str[i]>'9')    return 0; // 正负号后一位为非数字，直接返回0
    } else if(str[i] == '-'){
        digit = -1;
        if(str[++i]<'0' || str[i]>'9')    return 0;
    }
    for(;i<strlen(str) && str[i]>='0' && str[i]<='9'; i++){
        num *= 10;
        num += str[i]-'0';
        if(digit == -1 && num * digit <= int_min){ // 为了防止字符串太长导致long越界，故每次运算完都检查是否越界
            return int_min;
        } else if(digit == 1 &&num >= int_max){
            return int_max;
        }
    }
    num *= digit; // 最后还要在检查一次。
    if(num<int_min){
        return int_min;
    }else if(num > int_max){
        return int_max;
    }else{
        return num;
    }
}


int main(int argc, char const *argv[])
{
    
    return 0;
}
