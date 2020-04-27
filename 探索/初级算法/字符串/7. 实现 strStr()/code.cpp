/*
 * @Author: MetGuo 
 * @Date: 2020-04-27 15:40:11 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-27 16:07:03
 */

#include <stdio.h>
#include <string.h>



/*
我自己写的，存在以下问题，1. k变量多余，2.haystack[i]!='\0'这个判断效率慢，而且需要判断到haystack字符串的最后
但事实上，如果haystack“剩下的”字符串长度大于等于needle字符串长度即可。
*/
int strStr_1(char * haystack, char * needle){// 我自己写的
    if(strlen(needle) == 0){
        return 0;
    }
    if(strlen(needle)>strlen(haystack)){
        return -1;
    }
    int i, j, k;
    for(i=0; haystack[i]!='\0'; i++){
        for(j=0,k=0; needle[j]!='\0'&&haystack[i+k]!='\0'&&haystack[i+k]==needle[j];j++,k++);
        if(needle[j]=='\0'){
            return i;
        }
    }
    return -1;
}

//改进后的
int strStr(char * haystack, char * needle){
    int len_n = strlen(needle);
    int len_h = strlen(haystack);
    if(len_n == 0){
        return 0;
    }
    if(len_n>len_h){
        return -1;
    }
    int i, j;
    for(i=0; i<=len_h-len_n; i++){
        for(j=0; needle[j]!='\0'&&haystack[i+j]!='\0'&&haystack[i+j]==needle[j];j++);
        if(needle[j]=='\0'){
            return i;
        }
    }
    return -1;
}


int main(int argc, char const *argv[])
{
    char *haystack = "hello";
    char *needle = "ll";
    printf("%d\t", strStr(haystack, needle));
    return 0;
}
