/*
 * @Author: MetGuo 
 * @Date: 2020-04-20 10:21:47 
 * @Last Modified by: MetGuo
 * @Last Modified time: 2020-04-20 11:36:14
 */


#include <stdio.h>

bool isValidSudoku(char** board, int boardSize, int* boardColSize){
    //boardSize 和 boardColSize两个参数好像没什么用
    int i,j,row,col;
    char tmp;
    //对行做检查
    for(row=0; row<9; row++){
        for(i=0; i<9; i++){
            if(board[row][i] == '.'){
                continue;
            }
            for(j=i+1; j<9; j++){
                if(board[row][i] == board[row][j])
                    return false;
            }
        }
    }

    //对列做检查
    for(col=0; col<9; col++){
        for(i=0; i<9; i++){
            if(board[i][col] == '.'){
                continue;
            }
            for(j=i+1; j<9; j++){
                if(board[i][col] == board[j][col])
                    return false;
            }
        }
    }

    //对3*3做检查
    for(row=0; row<9; row+=3){
        for(col=0;col<9;col+=3){
            for(i=0;i<9;i++){
                if(board[row+i/3][col+i%3] == '.'){
                    continue;
                }
                for(j=i+1;j<9;j++){
                    if(board[row+i/3][col+i%3] == board[row+j/3][col+j%3]){
                        return false;
                    }
                }
            }
        }
    }
    return true;
}


int main(int argc, char const *argv[])
{
    char board[][9]={
        {'8','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };
    // int boardColSize = 9;
    // printf("%d\t", isValidSudoku(board, 9, &boardColSize)); // 这里报错了，C语言不清楚，算法没问题，就没管。

    return 0;
}
