class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        Arrays.fill(arr,-1);
        System.out.println(Arrays.toString(arr));
        for(int i:nums)
        {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<arr.length;i++)
            if(arr[i]!=i)
                return i;
        return-1;
    }
}
