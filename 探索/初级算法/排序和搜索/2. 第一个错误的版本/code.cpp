/*
 * @Author: MetGuo 
 * @Date: 2020-05-19 09:42:52 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-19 10:17:35
 */


#include <stdio.h>

// The API isBadVersion is defined for you.
bool isBadVersion(int version);


int firstBadVersion(int n) {
    int start = 1;
    while(start<=n){
        // int mid = (start + n) / 2;
        int mid = start + (n - start) / 2; // 不用上面代码是因为，上面的代码可能溢出int的取值范围
        if(isBadVersion(mid)){
            n = mid-1;
        } else{
            start = mid+1;
        }
    }
    return start;
}



int main(int argc, char const *argv[])
{
    
    return 0;
}
