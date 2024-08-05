class Solution {
    public int minOperations(String[] logs) {
        int steps=0;
        for(String str:logs)
        {
            if(str.indexOf("../")>-1 && steps!=0)
            steps--;
            else if(str.indexOf("./")>-1)
            ;
            else
            steps++;
        }
        return steps<=0?0:steps;
    }
}