class Solution {
    public int minCostClimbingStairs(int[] arr) {
       int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(func(dp,arr,n-1),func(dp,arr,n-2));
    }
    static int func(int[]dp , int[]arr, int n ){
        if(n<=1)
            return arr[n];
        if(dp[n]!=-1)
            return dp[n];
        int left = func(dp,arr,n-1) + arr[n];
        int right = left-1;
        if(n-2>=0)
        {
            right = func(dp,arr,n-2) + arr[n];
        }
        return dp[n] = Math.min(left,right);
    // return 20;
    }
}