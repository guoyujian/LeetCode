/*
 * @Author: MetGuo 
 * @Date: 2020-04-25 10:57:52 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-25 11:31:15
 */

#include <stdio.h>
#include <string.h>

bool isAlpNum(char ch){
    return (ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z') || (ch>='0'&&ch<='9');
}

bool isPalindrome(char * s){ //忽略大小写，只考虑字母和数字
    if(strlen(s) == 0){
        return true;
    }
    int i = 0,j = strlen(s)-1;
    while(i<j){
        for(;i<j && !isAlpNum(s[i]); i++);
        for(;i<j && !isAlpNum(s[j]); j--);
        if(s[i]>='A'&&s[i]<='Z'){ // 大写转小写
            s[i] = s[i] - 'A' + 'a';
        }
        if(s[j]>='A'&&s[j]<='Z'){ // 大写转小写
            s[j] = s[j] - 'A' + 'a';
        }
        if(s[i] != s[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;
}




int main(int argc, char const *argv[])
{
    char *s = "ab2a"; 
    printf("%d\t", isPalindrome(s));
    return 0;
}
