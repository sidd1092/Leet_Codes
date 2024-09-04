class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);
        return solve(m-1,n-1,dp);
    }
    public static int solve(int m, int n, int[][] dp) {
        if(n<0||m<0)
            return 0;
        if(n==0&&m==0)
            return 1;
        if(dp[m][n]!=-1)
            return dp[m][n];
        int up = solve(m-1,n,dp);
        int left = solve(m,n-1,dp);
        return dp[m][n] = up + left;
    }
}