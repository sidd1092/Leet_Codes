class Solution {
    public int[][] merge(int[][] arr) {
        ArrayList<int[]> LS = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = 0,end = 0,len=arr.length;
        for(int i = 0;i<len;i++)
        {
            start = arr[i][0];
            int max = arr[i][1];
            while(i<len-1 && max>=arr[i+1][0]){
                i++;
                max = Math.max(max,arr[i][1]);
            }
            end = max;
            LS.add(new int[]{start,end});
        }
        len = LS.size();
        int[][] res = new int[len][2];
        for (int i = 0; i < len; i++) {
            int[] nums = LS.get(i);
            for (int j = 0; j < 2; j++) {
                res[i][j] = nums[j];
            }
        }
        return res;
    }
}