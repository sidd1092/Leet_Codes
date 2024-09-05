class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        while (true) {
            int t = lowerUPPER(str);
            if (t > -1) {
                str.deleteCharAt(t);
                str.deleteCharAt(t);
            } else
                return str.toString();
        }
    }
    int lowerUPPER(StringBuilder str) {
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) - 32 == str.charAt(i + 1) || str.charAt(i) + 32 == str.charAt(i + 1))
                return i;
        return -1;
    }
}