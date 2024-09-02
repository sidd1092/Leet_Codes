class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
    public static int solve(int arr[], int k)
    {
        int count = 0,odd=0,l=0,r=0,len = arr.length;
        while(r<len)
        {
            if(arr[r]%2==1)
                odd++;
            while(odd>k)
            {
                if(arr[l]%2==1)
                    odd--;
                l++;
            }
            if(odd<=k)
                count += (r-l+1);
            r++;
        }
        return count;
    }
}