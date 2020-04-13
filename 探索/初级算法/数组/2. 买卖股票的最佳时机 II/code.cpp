/*
 * @Author: MetGuo 
 * @Date: 2020-04-12
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-13 20:29:17
 */
#include <stdio.h>


//主体
/**
 * 第i天买进，从i+1天向后找股票价格【最大最近】一天（假设为j）卖出，计算利润
 * 令i=j+1进行循环
 * 注意：i的起始值不一定为0
 * j的边界问题。
 */
int maxProfit(int* prices, int pricesSize){
    int i,j,profit = 0;
    //小于等于一个元素的时候
    if(pricesSize<=1){
        return 0;
    }
    
    //大于一个元素的时候
    for(i=0; i<pricesSize-1; i++){
        if(prices[i] >= prices[i+1]){
            continue;
        }else {
            for(j=i+1; j<pricesSize; j++){
                if(j == pricesSize-1 && prices[j] > prices[i]){
                    profit += prices[j] - prices[i];
                    i=j; //在下一轮中i++，所以这里只需要i=j
                    break;
                } else if(prices[j]>prices[j+1]){
                    profit += prices[j] - prices[i];
                    i=j;
                    break;
                } else{
                    continue;
                }
            }
        }
    }
    return profit;
}





//test
int main(int argc, char const *argv[])
{
    //测试用例1
    // int prices[] = {1,2,3,4,5};
    // int pricesSize = 5;
    //测试用例2
    // int prices[] = {7,1,5,3,6,4};
    // int pricesSize = 6;
    //测试用例3
    int prices[] = {7,6,4,3,1};
    int pricesSize = 5;
    //测试用例4
    // int prices[] = {1,2};
    // int pricesSize = 2;

    //测试用例5
    // int prices[] = {2,1,4};
    // int pricesSize = 3;
    int profit = maxProfit(prices, pricesSize);
    printf("MaxProfit is : %d", profit);
    return 0;
}
