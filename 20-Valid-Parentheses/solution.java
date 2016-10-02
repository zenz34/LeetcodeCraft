public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        char preCh = '\0';
        
        for (int i = 0; i != s.length - 1; i++) {
            if (i % 2 == 0) {   //  odd
                if (s.charAt(i) != '(' && s.charAt(0) != '[' && s.charAt(0) != '{') {
                    return false;
                }
                
                preCh = s.charAt(i);
            }
            else {              //  even
                if (preCh == '(') {
                    if (s.charAt(i) != ')') {
                        return false;
                    }
                }
                else if (preCh == '[') {
                    if (s.charAt(i) != ']') {
                        return false;
                    }                    
                }
                else if (preCh == '{') {
                    if (s.charAt(i) != '}') {
                        return false;
                    }                    
                }
                else {
                    return false;
                }
            }
        }
        
        return true;
    }
}