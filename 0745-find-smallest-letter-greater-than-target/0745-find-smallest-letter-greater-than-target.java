class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        if(target<arr[0] || target>=arr[arr.length-1])
            return arr[0];
        int s =0,e=arr.length-1;
        while(s<e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]<=target)
            s=mid+1;
            else
            e=mid;
        }
        return arr[s];        
    }
}