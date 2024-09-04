class Solution {
    public int climbStairs(int n) {        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n, dp);
    }
    public static int solve (int n, int[] dp) {
        if(n==0)
            return 1;
        if(n<0) 
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int one = solve (n-1,dp);
        int two = solve (n-2,dp);
        dp[n] = one + two ;
        return dp[n];
    }
}