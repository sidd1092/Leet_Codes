class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i =0, len = arr.length,peek,abs;
        while(i<len)
        {
            if(stk.isEmpty())
                stk.push(arr[i++]);
            else
            {
                peek =stk.peek();
                if(peek>0 && arr[i]<0)
                {
                    abs = arr[i]*-1;
                    if(abs>peek)
                        stk.pop();
                    else if(abs<peek)
                        i++;
                    else
                    {
                        i++;
                        stk.pop();
                    }
                }
                else
                    stk.push(arr[i++]);
            }
        }
        len = stk.size();
        int result[] = new int[len];
        i = 0;
        for(var val : stk)
        {
            result[i++] = val;
        }
        return result;
    }
}