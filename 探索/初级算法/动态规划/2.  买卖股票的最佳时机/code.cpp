/*
 * @Author: MetGuo 
 * @Date: 2020-05-22 10:54:36 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-22 10:57:33
 */


#include <stdio.h>

int findMax(int* prices, int pricesSize, int start){ // 找到从start下标开始的最大值的索引。
    int i ,max_index = start;
    for(i=start; i<pricesSize; i++){
        if(prices[i] > prices[max_index]){
            max_index = i;
        }
    }
    return max_index;
}

int maxProfit(int* prices, int pricesSize){
    int i, maxProfit = 0, max_index = 0;
    for(i=0; i<pricesSize; i++){
        if(max_index == i && i != pricesSize-1){
            max_index = findMax(prices, pricesSize, i+1);
        }
        if(prices[max_index] - prices[i] > maxProfit){
            maxProfit = prices[max_index] - prices[i];
        }
    }
    return maxProfit;
} // 运行效率有点低，通过了。





int main(int argc, char const *argv[])
{
    int prices[] = {7,6,4,3,1};
    int pricesSize = 5;
    printf("%d\t", maxProfit(prices, pricesSize));
    return 0;
}
