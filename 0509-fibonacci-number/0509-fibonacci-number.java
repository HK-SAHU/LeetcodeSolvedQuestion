class Solution {
    public int fib(int n) {
        int[] dp= new int[n+1];
        return f(n, dp);
    }
    
    public int f(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans= f(n-1, dp)+f(n-2, dp);
        dp[n]=ans;
        return ans;
    }
}