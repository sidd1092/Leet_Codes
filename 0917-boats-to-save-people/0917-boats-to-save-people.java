class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int l = 0,r = arr.length-1;
        int count =0;
        while(l<=r)
        {
            if(arr[l]+arr[r]<=limit)
            {
                count++;
                r--;
                l++;
            }
            else
            {
                r--;
                count++;
            }
        }
        return count;
    }
}