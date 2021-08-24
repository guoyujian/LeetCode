class Solution {
    public boolean exist(char[][] board, String word) { //抄的原来自己写的答案
        if(word==null || word.length() == 0 || board==null || board.length == 0 || board[0].length == 0){
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    boolean hasBeenUsed[][] = new boolean[board.length][board[0].length];
                    for (boolean[] tmp : hasBeenUsed) {
                        Arrays.fill(tmp, false);
                    } //初始置为false
                    hasBeenUsed[i][j] = true;
                    if(helper(board, i, j, hasBeenUsed, word, 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, int i, int j, boolean[][] hasBeenUsed, String word, int n){
        if(word.length() == n){
            return true;
        }
        if(j+1 < board[0].length && board[i][j+1] == word.charAt(n) && !hasBeenUsed[i][j+1]){
            hasBeenUsed[i][j+1] = true;
            if(helper(board, i, j+1, hasBeenUsed, word, n+1)){
                return true;
            } else {
                hasBeenUsed[i][j+1] = false;
            }
        }

        if(j-1 >= 0 && board[i][j-1] == word.charAt(n) && !hasBeenUsed[i][j-1]){
            hasBeenUsed[i][j-1] = true;
            if(helper(board, i, j-1, hasBeenUsed, word, n+1)){
                return true;
            } else {
                hasBeenUsed[i][j-1] = false;
            }
        }

        if(i+1 < board.length && board[i+1][j] == word.charAt(n) && !hasBeenUsed[i+1][j]){
            hasBeenUsed[i+1][j] = true;
            if(helper(board, i+1, j, hasBeenUsed, word, n+1)){
                return true;
            } else {
                hasBeenUsed[i+1][j] = false;
            }
        }

        if(i-1 >=0 && board[i-1][j] == word.charAt(n) && !hasBeenUsed[i-1][j]){
            hasBeenUsed[i-1][j] = true;
            if(helper(board, i-1, j, hasBeenUsed, word, n+1)){
                return true;
            } else {
                hasBeenUsed[i-1][j] = false;
            }
        }
        return false;
    }
}