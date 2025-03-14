class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if (n==1)
        return arr[0];
        if(n==2)
            return Math.max(arr[0],arr[1]);
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.max(func(dp,arr,n-1),func(dp,arr,n-2));
    }
    static int func(int[]dp , int[]arr, int n ){
        if(n<=1)
            return arr[n];
        if(dp[n]!=-1)
            return dp[n];
        // int left = func(dp,arr,n-1) + arr[n];
        int mid = Integer.MIN_VALUE;
        if(n-2>=0)
        mid = func(dp,arr,n-2) + arr[n];
        int right = mid-1;
        if(n-3>=0)
        {
            right = func(dp,arr,n-3) + arr[n];
        }
        return dp[n] = Math.max(right,mid);
    // return 20;
    }
}