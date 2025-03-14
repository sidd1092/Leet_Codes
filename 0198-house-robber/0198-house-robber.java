class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if (n==1)
        return arr[0];
        if(n==2)
            return Math.max(arr[0],arr[1]);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // return Math.max(func(dp,arr,n-1),func(dp,arr,n-2));
        return func(dp,arr,n-1);
    }
    static int func(int[]dp , int[]arr, int n ){
        if(n<0)
            return 0;
        if(n==0)
            return arr[0];
        if(dp[n]!=-1)
            return dp[n];
        int pick = Integer.MIN_VALUE;
        // if(n-2>=0)
        pick = func(dp,arr,n-2) + arr[n];
        int not_pick = pick;
        if(n-1>=0)
            not_pick = func(dp,arr,n-1) + 0;
        return dp[n] = Math.max(not_pick,pick);
    }
}