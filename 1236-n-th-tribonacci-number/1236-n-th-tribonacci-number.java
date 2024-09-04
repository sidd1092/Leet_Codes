class Solution {
    public int tribonacci(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,dp);
    }
    public static int f(int index,int[] dp){
        if(index==0){
            return 0;
        }
        if(index==1) return 1;
        if(index==2) return 1;
        if(dp[index]!=-1){
            return dp[index];
        }
        int one = f(index-1,dp);
        int two=f(index-2,dp);
        int three=f(index-3,dp);
        return dp[index]=one+two+three;
    }
}