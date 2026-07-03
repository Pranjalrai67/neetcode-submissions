class Solution {
    int[] dp;
    public int solve(int n ){
        if( n < 0){
            return 0;
        }
        if(n == 0  ){
            return dp[n] = 0;
        }
        if(n == 2 || n == 1){
            return dp[n] = 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        return dp[n] =  solve(n-1) + solve(n-2) + solve(n-3);
    }
    public int tribonacci(int n) {
        dp = new int[n+1];
        return solve(n);
    }
}