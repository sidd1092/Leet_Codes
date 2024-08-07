class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> ls = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int len2d = arr.length;
        int len1d = arr[0].length;
        for(int i = 0;i<len2d;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<len1d;j++){
                min = Math.min(arr[i][j],min);
                if(i==0){
                    int max = Integer.MIN_VALUE;
            for(int temp = 0;temp<len2d;temp++){
                max = Math.max(arr[temp][j],max);
            }
            set.add(max);
                }
            }
            if(set.contains(min))
            ls.add(min);       
        }
        return ls;
    }
}