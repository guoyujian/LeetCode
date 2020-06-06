/*
 * @Author: 11599 
 * @Date: 2020-06-06 21:55:39 
 * @Last Modified by: 11599
 * @Last Modified time: 2020-06-06 22:40:32
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int lengthOfLongestSubstring1(char * s){
    int i,j, max_len=0;
    for(i=0; i<strlen(s); i++){
        int alps[95]={0};
        for(j=i; j<strlen(s); j++){
            if(alps[s[j]-' '] == -1){
                alps[s[j]-' '] ++;
            } else{
                break;
            }
        }
        if(j-i > max_len){
            max_len = j-i;
        }

    }
    return max_len;
} // 测试通过，但是超出时间限制。


int main(){
   
   return 0;
}

