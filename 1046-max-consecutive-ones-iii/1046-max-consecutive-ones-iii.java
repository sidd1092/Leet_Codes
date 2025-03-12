class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0, zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // If the current element is 0, increase the zero count.
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If zeroCount exceeds k, shrink the window from the left
            // until the window becomes valid (zeroCount <= k).
            while (zeroCount > k) {
                if (nums[left++] == 0) {
                    zeroCount--;
                }
            }
            
            // Update the maximum length.
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
