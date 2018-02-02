/*
Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

        The input string does not contain leading or trailing spaces and the words are always separated by a single space.

        For example,
        Given s = "the sky is blue",
        return "blue is sky the".

        Could you do it in-place without allocating extra space?
*/


public class Solution {
    private static void rshiftCharArray(char[] s, int index) {
        for (int i = s.length - 1; i >= index; i--) {    //  call shortcut to input this code block; default // input i,j,k? start Index, boundary,  i j k which ++ or --
            s[i] = s[i - index];
        }
    }

    private static void charArrayInsertStr(char s[], int index, String str) {
        for (int i = 0; i < s.length && i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
    }

    private static void reverseWords(char[] s) {
        StringBuilder last = new StringBuilder();
        //  'a b c d e'
        for (int i = s.length - 1; i >= 0; i--) {

            //System.out.println(last.toString());
            if (s[i] != ' ') {
                last.insert(0, s[i]);
                System.out.println(last.toString());
            }
            else if (s[i] == ' ' || i == 0){
                last.append(' ');
                rshiftCharArray(s, last.length());
                System.out.println(s);

                charArrayInsertStr(s, 0, last.toString());
                System.out.println(s);

                last.delete(0, last.length() - 1);
                System.out.println(last.toString());
            }
        }
    }

    public static void main(String[] args) {
        char[] s = {'a', ' ', 'b', ' ', 'c', ' ', 'd', ' ', 'e'};


        reverseWords(s);
    }
}