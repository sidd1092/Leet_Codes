class Solution {
    public int minPathSum(int[][] grid) {
        int i = grid.length;
        int j = grid[0].length;
        int[][] dp  = new int[i][j];
        for (int[] ar : dp)
            Arrays.fill(ar, -1);
        return solve(i-1,j-1,grid,dp);
    }
    public static int solve(int i,int j,int[][] arr,int[][] dp)
    {
        if(i<0||j<0)
            return 1000000;
        if(i==0 && j==0)
            return arr[0][0];
        if(dp[i][j] != -1)
            return dp[i][j];
        int up=0, left=0;
        // if (i-1>=-1)
            up = solve(i-1,j,arr,dp);
        // if(j-1>=-1)
            left = solve(i,j-1,arr,dp);
        return dp[i][j] = arr[i][j] + Math.min(up,left);
    }
}