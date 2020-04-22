/*
 * @Author: MetGuo 
 * @Date: 2020-04-22 10:45:33 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-22 10:50:03
 */

#include <stdio.h>

void reverseString(char* s, int sSize){
    int i,j;
    char tmp;
    for(i=0,j=sSize-1; i<j; i++,j--){
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}



int main(int argc, char const *argv[])
{
    char s[] = {'H','a','n','n','a','h'};
    int sSize = 6;
    reverseString(s, sSize);
    int i;
    for(i=0; i<sSize; i++){
        printf("%c", s[i]);
    }
    return 0;
}
