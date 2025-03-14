class Solution {
    public int tribonacci(int n) {
    int[] dp = new int[n+1];
    Arrays.fill(dp,0);
    return func(n,dp);
    }
    private int func(int n ,int[] dp)
    {
        if(n==0)
            return 0;
        if (n<3)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        dp[n] = func(n-1,dp)+func(n-2,dp)+func(n-3,dp);
        return dp[n];
    }
}