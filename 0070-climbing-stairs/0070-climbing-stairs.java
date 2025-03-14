class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        return func(n,dp);
    }
    int func(int n,int[]dp)
    {
        if(n<=1)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        return dp[n]= func(n-1,dp)+func(n-2,dp);
    }
}