class Solution {
    public int[][] merge(int[][] arr) {
        ArrayList<ArrayList<Integer>> LS = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        // System.out.println(Arrays.toString(arr));
        int start = 0,end = 0,len=arr.length;
        for(int i = 0;i<len;i++)
        {
            start = arr[i][0];
            int max = arr[i][1];
            // if()
            while(i<len-1 && max>=arr[i+1][0]){
                i++;
                max = Math.max(max,arr[i][1]);
            }
            if(i>0)
                end = Math.max(max,arr[i-1][1]);
            else
                end = arr[i][1];
            ArrayList<Integer> ls = new ArrayList<>();
            ls.add(start);
            ls.add(end);
            LS.add(ls);
        }
        return convertToArray(LS);
    }
    public static int[][] convertToArray(ArrayList<ArrayList<Integer>> arrayList) {
        int numRows = arrayList.size();
        int[][] result = new int[numRows][2];
        for (int i = 0; i < numRows; i++){
            ArrayList<Integer> rowList = arrayList.get(i);
            for (int j = 0; j < 2; j++)
                result[i][j] = rowList.get(j);
        }
        return result;
    }
}