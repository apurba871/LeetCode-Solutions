// Last updated: 4/24/2026, 8:15:21 AM
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                char top;
                if (stack.size() != 0)
                    top = stack.pop();
                else return false;
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '['))
                    continue;
                else {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) return false;
        else {
            if (stack.size() == 0) return true;
            return false;
        }
    }
}