class Solution {
    public static List<String> ans = new ArrayList<>();
    public static HashMap<Character, char[]> map = new HashMap<>();    
    public Solution() {
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
    }
    public List<String> letterCombinations(String digits) {
        ans.clear();
        if(digits.isEmpty()) {
            List<String> a = new ArrayList<>();
            return a;
        }
        solve(digits,"");
        return ans;
    }
    public static void solve(String input , String output) {
        if(input.isEmpty()){
            ans.add(output);
            return;    
        }
        char ch = input.charAt(0);
        for(char c : map.get(ch))
            solve(input.substring(1),output+c);
    }
}