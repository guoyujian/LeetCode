/*
 * @Author: MetGuo 
 * @Date: 2020-04-21 10:38:51 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-21 10:55:46
 */


#include <stdio.h>



void rotate(int** matrix, int matrixSize, int* matrixColSize){
	int i,j;
	int temp;
	for(i=0;i<matrixSize/2;i++){
		for(j=i;j<matrixSize-i-1;j++){
			temp = matrix[i][j];
			matrix[i][j]=matrix[matrixSize-j-1][i];
			matrix[matrixSize-j-1][i]=matrix[matrixSize-i-1][matrixSize-j-1];
			matrix[matrixSize-i-1][matrixSize-j-1] = matrix[j][matrixSize-i-1];
			matrix[j][matrixSize-i-1] = temp  ;
		}
	} //之前做过
}


int main(int argc, char const *argv[])
{
    
    return 0;
}
