// class Solution {
//     public int search(int[] nums, int target) {
//         int s= 0, e=nums.length-1;
//         while(s<e)
//         {
//             int mid = s+(e-s)/2;
//             if(nums[mid]>nums[e])
//                 s=mid+1;
//             else
//                 e=mid;
//         }
//         int ind1=-1,ind2=-1;
//         if(s>0)
//         ind1 = Arrays.binarySearch(nums, 0, s-1, target);
//         ind2 = Arrays.binarySearch(nums, s, nums.length-1, target);
//         return Math.max(ind1,ind2);
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }        
        int rotationIndex = s;
        int ind1 = Arrays.binarySearch(nums, 0, rotationIndex, target);
        int ind2 = Arrays.binarySearch(nums, rotationIndex, nums.length, target);
        if (ind1 >= 0) return ind1;
        if (ind2 >= 0) return ind2;        
        return -1;
    }
}