class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans=0;
        int m=grid.length;    // row
        int n=grid[0].length;   // col
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    int sum=dfs(grid,i,j,m,n);
                    ans= Math.max(sum, ans);
                }
            }
        }
        return ans;
    }
    public int dfs (int[][] grid, int i, int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0) return 0;
        int temp= grid[i][j];
        grid[i][j]=0;
        int upSum=dfs(grid, i-1, j,m,n);
        int downSum= dfs(grid, i+1, j,m,n);
        int leftSum= dfs(grid, i,j-1,m,n);
        int rightSum= dfs(grid, i, j+1,m,n);
        grid[i][j]=temp;
        return temp+Math.max(Math.max(Math.max(upSum, downSum), leftSum),rightSum);
    }
}