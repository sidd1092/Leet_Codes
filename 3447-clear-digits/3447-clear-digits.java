class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch>='0' && ch<='9' && !stk.isEmpty())
                stk.pop();
            else
            stk.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stk)
            sb.append(ch);
        return sb.toString();
    }
}