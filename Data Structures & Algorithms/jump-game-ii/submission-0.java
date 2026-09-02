class Solution {
    Integer[] dp;
    public int solve(int[] nums,int ind){
        if(ind >= nums.length-1){
            return 0;
        }
        if(dp[ind] != null){
            return dp[ind];
        }
        if(nums[ind] == 0){
            return Integer.MAX_VALUE;
        }
        int toReach = Integer.MAX_VALUE;
        int maxJumps = nums[ind];
        for(int i = 1; i <= maxJumps;i++){
            int check = solve(nums,ind+i);
            int currJump =check == Integer.MAX_VALUE ? Integer.MAX_VALUE : 1 + check;
            toReach = Math.min(toReach,currJump);
        }
        return dp[ind] = toReach;
    }
    public int jump(int[] nums){
        dp = new Integer[nums.length+1];
        int ans = solve(nums,0);
        return ans;
    }
}