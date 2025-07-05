class Solution {
    public void solveSudoku(char[][] board) {
        solve(board , 0 , 0);
    }
    private boolean solve(char[][] board , int row , int col){
        if(row == 9){
            return true;
        }
        int newRow = row;
        int newCol = col + 1;
        if(col + 1 == 9){
            newRow = row + 1;
            newCol = 0;
        }
        if(board[row][col] != '.'){
            return solve(board , newRow , newCol);
        }
        for(char digit = '1' ; digit <= '9' ; digit++){
            if(isSafe(board , row , col , digit)){
                board[row][col] = digit;
                if(solve(board , newRow , newCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    private boolean isSafe(char[][] board , int row , int col , char digit){
        for(int i = 0 ; i <= 8 ; i++){
            if(board[i][col] == digit){
                return false;
            }
        }
        for(int j = 0 ; j <= 8 ; j++){
            if(board[row][j] == digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i < sr+3 ; i++){
            for(int j = sc ; j < sc+3 ; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
}