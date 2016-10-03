public class Solution {
    public boolean isValid(String s) {
     if (str == null || str.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        char ch = '\0';

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);



            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    //System.out.println(stack.pop());
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    //return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}