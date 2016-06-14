public class Solution {
    public String reverseString(String s) {
        int i = 0;
        int len = 0;
        char tmp = ' ';
        
        if (null == s) {
            return s;
        }
        
        char a[] = s.toCharArray();
        len = a.length;
        
        for (i = 0; i <= len / 2 - 1; i++) {
            tmp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = tmp;
        }
        
        s = String.valueOf(a);
        
        return s;
    }
}
