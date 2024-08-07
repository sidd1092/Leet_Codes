class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++)
            map.put(i, new ArrayList<>());
        for(int arr[]:trust)
            map.get(arr[0]).add(arr[1]);
        ArrayList<Integer> emptyKey = new ArrayList<>();
        for(int i : map.keySet())
            if(map.get(i).isEmpty())
                emptyKey.add(i);
        if(emptyKey.size()!=1)
            return -1;
        int possibleJudge = emptyKey.get(0);
        for(int i : map.keySet())
            if(!map.get(i).isEmpty() && !map.get(i).contains(possibleJudge))
                return -1;
        return possibleJudge;
    }
}