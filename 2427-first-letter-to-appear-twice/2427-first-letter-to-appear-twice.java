class Solution {
    public char repeatedCharacter(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i))!=i){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}