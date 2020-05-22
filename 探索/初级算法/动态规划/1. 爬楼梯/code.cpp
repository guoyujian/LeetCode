/*
 * @Author: MetGuo 
 * @Date: 2020-05-20 12:06:24 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-05-22 11:35:22
 */


#include <stdio.h>

//计算N的阶乘
int factorial(int n){
    if(n == 1){
        return 1;
    }
    return n * factorial(n-1);
}

//计算n,r的组合数
int combine(int n, int r){
    if(r == 0 || n == 1 || n == r){
        return 1;
    }
    return factorial(n) / factorial(r) / factorial(n-r);
}

int climbStairs1(int n){
    int i, num = 0;
    for(i=0; i<=n/2; i++){
        num += combine(n-i, i);
    }
    return num;
} //个人解法：逻辑应该没问题，但是在计算阶乘时会溢出（例如，输入35）。


int climbStairs2(int n){
	unsigned long s;
    if(n == 1){
		s = 1;
	} else if(n == 2){
		s = 2;
	} else {
		s = climbStairs2(n-1) + climbStairs2(n-2);
	}
	return s;
} // 会超出时间范围。


/*
有n个台阶时，设有count(n)种走法，最后一步走1个台阶，有count(n-1)种走法；最后一步走2个台阶，有count(n-2)种走法。于是count(n)=count(n-1)+count(n-2)。
　　可见，此问题的数学模型是斐波那契数。
*/
int climbStairs(int n){
	int x1 = 1;
	int x2 = 1;
	int i ;
	for(i = 2; i<=n; i++){
		int x3 = x1 + x2;
		x1 = x2;
		x2 = x3;
	}
	return x2;
} 


int main(int argc, char const *argv[])
{
    
    return 0;
}
