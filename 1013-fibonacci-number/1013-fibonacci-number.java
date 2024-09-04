class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(n,dp);
    }
    public static int func(int n , int[] dp)
    {
        if(n==0)
            return 0;
        if(n == 1)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        int one = func(n-1,dp);
        int two = func(n-2,dp);
        return dp[n] = one+two;
    }
}