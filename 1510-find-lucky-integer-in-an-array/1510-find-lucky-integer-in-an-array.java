class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> hm = new HashMap<>();
       for(int i : arr)
       {
        hm.put(i,hm.getOrDefault(i,0)+1);
       } 
       int max = -1;
       for(int i : hm.keySet())
       {
        if(hm.get(i) == i)
        max = Math.max(max,i);
       }
       return max;
    }
}