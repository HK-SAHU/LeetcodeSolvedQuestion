class Solution {
    
    public void queen(char[][] board, int row, List<List<String>> solution){
        int n= board.length;
        if(row==n){
            solution.add(makeString(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                queen(board, row+1,solution);
                board[row][col]='.';  // backtrack
            }
        }
    }
    
    public boolean isSafe(char[][] board, int row, int col){
        // check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        
        // check left diagonal
        int maxLeft= Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]=='Q'){
                return false;
            } 
        }
        
        // check right diagonal
        int maxRight= Math.min(row, board.length-1-col);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]=='Q'){
                return false;
            }
        }
        return true;
    }
    
    public static List<String> makeString(char[][] board){
        List<String> L= new ArrayList<>();
        for (int i=0;i<board.length;i++){
            String row= new String(board[i]);
            L.add(row);
        }
        return L;
    }
    
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        List<List<String>> solution= new ArrayList<>();
        queen(board, 0, solution);
        return solution;
    }
}