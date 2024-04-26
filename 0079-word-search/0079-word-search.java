class Solution {
    public boolean exist(char[][] board, String word) {
        char[] wordArr= word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==wordArr[0] && checkExist(board,i,j,wordArr,0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkExist(char[][] board, int i, int j, char[] wordArr, int idx){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=wordArr[idx] || board[i][j]=='*') return false;
        if(idx==wordArr.length-1) return true;
        char ch=board[i][j];
        board[i][j]='*';
        boolean res=checkExist(board,i+1,j,wordArr,idx+1) ||
        checkExist(board,i-1,j,wordArr,idx+1) ||  
        checkExist(board,i,j+1,wordArr,idx+1) ||
        checkExist(board,i,j-1,wordArr,idx+1);
        board[i][j]=ch;
        return res;
    }
}