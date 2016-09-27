public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        char[] a = s.toCharArray();
        char tmp = ' ';
        
        for (int head = 0, tail = a.length - 1; head <= tail; head++, tail--) {
            tmp = a[head];
            a[head] = a[tail];
            a[tail] = tmp;
        }

        return String.valueOf(a);
    }
}