class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0 , left = 0 , right = 0;
        for(int i : nums) sum += i;
        for(int i = 0; i<nums.length; i++){
            left += nums[i];
            right = sum - left + nums[i];
            if(left == right) return i;
        }
       return -1;
    }
}