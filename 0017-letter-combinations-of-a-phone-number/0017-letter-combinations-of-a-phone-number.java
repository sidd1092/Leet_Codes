class Solution {
    public static List<String> ans = new ArrayList<>();
    public static HashMap<Character, String> map = new HashMap<>();    
    public Solution() {
        map.put('3', "def");
        map.put('2', "abc");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>(){};
        ans.clear();
        solve(digits,"");
        return ans;
    }
    public static void solve(String input, String output)
    {
        if(input.length()==0){
            ans.add(output);
            return;
        }
        String letters = map.get(input.charAt(0));
        if (letters != null)
        for(char ch: letters.toCharArray())
            solve(input.substring(1),output+ch );
    }
}