public class Solution {
    public int pivotIndex(int[] nums) {
        int array_sum = 0;
        for (int num : nums)
            array_sum += num;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum + nums[i]== array_sum - leftSum )
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}