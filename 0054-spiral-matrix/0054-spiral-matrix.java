class Solution
{
    public List<Integer> helper(int[][] m, List<Integer> ans, int k, int j)
    {
        int stRow = 0;
        int stCol = 0;
        int endRow = k - 1;
        int endCol = j - 1;
        int cnt = 0;
        int total = k*j;
        while (cnt < total)
        {
            for (int i = stCol; i <= endCol && cnt < total; i++)
            {
                ans.add(m[stRow][i]);
                cnt++;
            }
            stRow++;
            for (int i = stRow; i <= endRow && cnt < total; i++)
            {
                ans.add(m[i][endCol]);
                cnt++;
            }
            endCol--;
            for (int i = endCol; i >= stCol && cnt < total; i--)
            {
                ans.add(m[endRow][i]);
                cnt++;
            }
            endRow--;
            for (int i = endRow; i >= stRow && cnt < total; i--)
            {
                ans.add(m[i][stCol]);
                cnt++;
            }
            stCol++;
        }
        return ans;
    }
    public List<Integer> spiralOrder(int[][] m)
    {
        List<Integer> ans = new ArrayList<>();
        int r = m.length;
        int c = m[0].length;
        return helper(m, ans, r, c);
    }
}