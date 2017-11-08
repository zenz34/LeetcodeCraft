class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) {
                    return i;
                }
                
                if (i + j == haystack.length()) {
                    return -1;
                }
                
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

            }
        }
    }
}



/*
需要考虑

string 长度为0的情况

比如
haystack长度为0
没问题

但是needle长度为0
取charAt(0)就会越界


*/

