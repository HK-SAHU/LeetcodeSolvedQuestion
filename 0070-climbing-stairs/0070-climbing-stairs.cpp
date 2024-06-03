class Solution {
public:
    int climbStairsHelper(int n, vector<int>& memo) {
        // Base cases
        if (n <= 1) return 1;
        
        // If already computed, return the stored result
        if (memo[n] != -1) return memo[n];
        
        // Compute the result and store it in memo
        memo[n] = climbStairsHelper(n - 1, memo) + climbStairsHelper(n - 2, memo);
        return memo[n];
    }
    int climbStairs(int n) {
        // if(n<=1) return 1;
        // vector<int> dp(n+1,0);
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]= dp[i-1]+dp[i-2];
        // }
        // return dp[n];
        vector<int> memo(n + 1, -1);
        return climbStairsHelper(n, memo);
    }
};