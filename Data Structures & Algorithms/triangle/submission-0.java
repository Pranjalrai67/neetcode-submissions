class Solution {
    Integer[][] dp;
    public int solve(int currrow,int ind,int n,List<List<Integer>> triangle){
        if(currrow >= n){
            return 0;
        }
        if(dp[currrow][ind] != null){
            return dp[currrow][ind];
        }
        int sameDown = triangle.get(currrow).get(ind) + solve(currrow+1,ind,n,triangle);
        int nextDown = triangle.get(currrow).get(ind) + solve(currrow+1,ind+1,n,triangle);

        return dp[currrow][ind] = Math.min(sameDown,nextDown);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n+1][n+1];
        int ans = solve(0,0,n,triangle);
        return ans;
    }
}