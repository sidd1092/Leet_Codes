class Solution
{
    public int getLucky(String s, int k)
    {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray())
            sb.append(ch - 'a' + 1);
        while (k-- > 0)
        {
            int temp = 0;
            for (char ch : sb.toString().toCharArray())
                temp += ch - '0';
            sb = new StringBuilder(String.valueOf(temp));
        }
        return Integer.parseInt(sb.toString());
    }
}