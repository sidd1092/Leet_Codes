class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(func(arr, dp, n - 1), func(arr, dp, n - 2));
    }
    static int func(int[]arr, int[]dp, int n ){
        if(n<=1)
            return arr[n];
        if(dp[n]!=-1)
            return dp[n];
        int left = arr[n]+ func(arr,dp,n-1) ;
        int right = left+1;
        if(n-2>=0)
        right =  arr[n]+func(arr,dp,n-2) ;
        return dp[n] = Math.min(right,left);
    }
}