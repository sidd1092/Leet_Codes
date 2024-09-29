class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int zero = nums[0];
        int one = nums[1];
        
        return Math.max((nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]) , (zero*one*nums[nums.length-1]));
    }
}