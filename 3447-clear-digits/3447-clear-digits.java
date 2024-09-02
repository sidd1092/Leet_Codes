class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();int pop=0;
        for(char ch : s.toCharArray())
        {
            if(ch>='0' && ch<='9' && !stk.isEmpty())
                stk.pop();
            else if(ch>='0' && ch<='9' && stk.isEmpty())
                pop++;
            else
            stk.push(ch);
            while(!stk.empty() && pop>0)
            {
                stk.pop();
                pop--;
            } 
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stk)
            sb.append(ch);
        return sb.toString();
    }
}