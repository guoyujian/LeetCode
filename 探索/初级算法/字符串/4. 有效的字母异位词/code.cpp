/*
 * @Author: MetGuo 
 * @Date: 2020-04-24 10:49:52 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-24 11:32:18
 */


#include <stdio.h>
#include <string.h>
#include <stdlib.h>

bool isAnagram(char * s, char * t){
    int s_len = strlen(s);
    int t_len = strlen(t);
    if(t_len != s_len){
        return false;
    } // 如果长度不一致,肯定不是异位词
    int s1[26]={0};
    int s2[26]={0};
    int i;
    for(i=0; i<s_len; i++){
        s1[s[i]-'a'] ++ ;  
    }
    for(i=0; i<t_len; i++){
        s2[t[i]-'a'] ++ ;  
    }
    for(i=0; i<26 && s1[i] == s2[i]; i++);
    if(i<26){
        return false;
    }
    return true;
}

//超出时间限制
bool isAnagram_1(char * s, char * t){
    int s_len = strlen(s);
    int t_len = strlen(t);
    if(t_len != s_len){
        return false;
    } // 如果长度不一致那肯定不是异位词
    int i,j;
    // int flags[t_len] = {0};
    int *flags = (int *) malloc(sizeof(int) * t_len);
    for(i=0; i<s_len; i++){ // 以s字符串为标准，找t中与之匹配的。
        for(j=0; j<t_len; j++){
            if(t[j]==s[i] && flags[j]!=1){
                flags[j] = 1;
                break;
            }
        }
    }
    for(j=0; j<t_len; j++){
        if(flags[j] != 1){
            return false;
        }
    }
    // free(flags);
    return true;
}


int main(int argc, char const *argv[])
{
    char *s = "a";
    char *t = "b";
    printf("%d\t", isAnagram(s, t));
    return 0;
}
