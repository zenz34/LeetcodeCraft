public class Solution {
    public String reverseString(String s) {
        int i = 0;
        int len = 0;
        char tmp = ' ';
        
        if (null == s) {
            return s;
        }
        
        len = s.length;
        
        for (i = 0; i < len; i++) {
            tmp = s[i];
            s[len - 1 - i] = s[i];
            s[i] = tmp;
        }
        
        return s;
    }
}