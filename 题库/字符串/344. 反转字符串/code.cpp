void reverseString(char* s, int sSize){
    int i,j;
    char tmp;
    for(i=0,j=sSize-1; i<j; i++,j--){
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}