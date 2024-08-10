class Solution {
    public int minimumPushes(String word)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : word.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        int len = map.keySet().size();
        int[] arr = new int[len];
        int index = 0;
        for(char i : map.keySet())
            arr[index++] = map.get(i);
        Arrays.sort(arr);
        index = 0;
        int sum =0;
        for(int i = len-1;i>=0 ;i--)
            sum = sum + (arr[i]*(index++ /8+1));
        return sum;  
    }
}