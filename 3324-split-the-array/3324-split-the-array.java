class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            int val = map.getOrDefault(i,0);
            if(val==2)
                return false;
            map.put(i,val+1);
            
        }
        return true;
    }
}