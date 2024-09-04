class Solution {
public:
    int f(int index,vector<int>&dp){
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
    int tribonacci(int n) {
        vector<int>dp(n+1,-1);
        return f(n,dp);
    }
};