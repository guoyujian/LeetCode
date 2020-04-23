/*
 * @Author: MetGuo 
 * @Date: 2020-04-23 11:07:29 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-23 12:45:30
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


//执行用时太高了！
int firstUniqChar(char * s){
    int i,j;
    int *flags = (int *) malloc(sizeof(int) * strlen(s)); 
    for(i=0; i<strlen(s); i++){
        flags[i] = 0;// 0标志没有重复
    }
    for(i=0; s[i]!='\0'; i++){
        if(flags[i]!=0){ //该位有重复
            continue;
        }
        for(j=i+1; s[j]!='\0'; j++){
            if(flags[j]==1){
                continue;
            }
            if(s[i] == s[j]){
                flags[i] = 1 ; // 也可以不要
                flags[j] = 1 ;
            }
        }
        if(flags[i]==0){ //该位有重复
            free(flags);
            return i;
        }
    }
    free(flags);
    return -1;
}
//使用hash表


int main(int argc, char const *argv[])
{
    char *s = "loveleetcode";
    int index = firstUniqChar(s);
    printf("%d\t", index);
    return 0;
}
