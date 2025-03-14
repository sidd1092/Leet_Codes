class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return func(dp,arr,n-1);
    }
    static int func(int[]dp , int[]arr, int n ){
        if(n<0)
            return 0;
        if(n==0)
            return arr[0];
        if(dp[n]!=-1)
            return dp[n];
        int pick = func(dp,arr,n-2) + arr[n];
        int not_pick = func(dp,arr,n-1) + 0;
        return dp[n] = Math.max(not_pick,pick);
    }
}