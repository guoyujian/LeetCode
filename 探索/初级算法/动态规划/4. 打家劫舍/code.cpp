/*
 * @Author: MetGuo 
 * @Date: 2020-05-25 12:11:52 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-25 15:39:22
 */

#include <stdio.h>
#include <stdlib.h>

int max(int a, int b){
    return a>b? a:b;
}

int rob(int* nums, int numsSize){
    int *dp = (int *) malloc(sizeof(int) * (numsSize+1));
    int i;
    if(numsSize == 0){
        return 0;
    }
    dp[0] = 0;
    dp[1] = nums[0];
    for(i=2; i<=numsSize; i++){
        dp[i] = max(dp[i-2]+nums[i-1], dp[i-1]);
    }
    return dp[numsSize];

} //抄的

/**
 * 动态规划方程：dp[n] = MAX( dp[n-1], dp[n-2] + num )
由于不可以在相邻的房屋闯入，所以在当前位置 n 房屋可盗窃的最大值，要么就是 n-1 房屋可盗窃的最大值，要么就是 n-2 房屋可盗窃的最大值加上当前房屋的值，二者之间取最大值

作者：guanpengchn
链接：https://leetcode-cn.com/problems/house-robber/solution/hua-jie-suan-fa-198-da-jia-jie-she-by-guanpengchn/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */



int main(int argc, char const *argv[])
{
    
    return 0;
}
