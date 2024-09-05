class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        char[] arr=s.toCharArray();
        int c=1,l=arr.length,i=1;
        StringBuilder sb=new StringBuilder();
        while(i<l)
        {
            if(arr[i]=='(')c++;
            else c--;
            if(c==0)
            {
                i+=2;
                c=1;
            }else
            {
                sb.append(arr[i]);
                i++;
            }
        }
        return sb.toString();
    }
}