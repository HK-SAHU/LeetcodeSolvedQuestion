class Solution {
    
    /*public boolean findRotation(int[][] mat, int[][] target) {
        int n= mat.length;
        int c90=0, c180= 0, c270=0, c0=0;
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                if(target[i][j]== mat[n-j-1][i])
                    c90++;
                if(target[i][j] == mat[n-i-1][n-j-1])
                    c180++;
                if(target[i][j]==mat[j][n-i-1])
                    c270++;
                if(target[i][j]== mat[i][j])
                    c0++;
            }
        }
        if(c90== n*n || c180 == n*n || c270==n*n || c0==n*n){
            return true;
        }
        else
            return false;
    }*/
    
    public static void reverse(int mat[]){
        int i=0;
        int j = mat.length-1 ;
        while(i<j){
            int temp= mat[i];
            mat[i]= mat[j];
            mat[j]= temp;
            i++;
            j--;
        }
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
     
        for(int i=0; i<4; i++){
            if(isEqual(mat,target)) return true;
            rotate(mat);
        }
        return false;
    }
    
    
    public static void rotate(int[][] mat){  
        int m = mat.length;
        for(int i=0; i<m; i++){
            for(int j=i; j<m; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0; i<mat[0].length;i++){
            reverse(mat[i]);
        }
        
        // for(int col1 = 0 , col2=m-1; col1<m/2; col1++,col2--){
        //     for(int row= 0; row<m; row++){
        //         int temp = check[row][col_1];
        //         check[row][col_1] = check[row][col_2];
        //         check[row][col_2] = temp;;
        //     }
        // }
    }
    

    public static boolean isEqual(int[][] m1 , int[][] m2){
        if(m1.length != m2.length) return false;
        if(m1[0].length != m2[0].length) return false;
        for(int row=0; row<m1.length; row++){
            for(int col = 0; col<m1[0].length; col++){
                if(m1[row][col] != m2[row][col]) return false;
            }
        }
        return true;
    }
    
}