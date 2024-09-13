class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int writeIndex = 0;
        for (int i = 0; i < len; i++) {
        int count = 1;
        while (i + 1 < len && chars[i] == chars[i + 1]) {
        i++;
        count++;
        }
        chars[writeIndex++] = chars[i];
        if (count > 1) {
        String countStr = String.valueOf(count);
        for (char c : countStr.toCharArray()) {
        chars[writeIndex++] = c;
        }
        }
        }
        return writeIndex;
        }
}




