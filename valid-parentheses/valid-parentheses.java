class Solution {
    public boolean isValid(String s) {
        
        if (s == null || s.length() == 0) {
            return false;
        }
        
        Stack<Character> parentheses = new Stack<>();
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                parentheses.push(ch);
            } else if (ch == ')') {
                if (parentheses.empty() || parentheses.pop() != '(') {
                    return false;
                }
            } else if (ch == ']') {
                if (parentheses.empty() || parentheses.pop() != '[') {
                    return false;
                }
            } else if (ch == '}') {
                if (parentheses.empty() || parentheses.pop() != '{') {
                    return false;
                }
            }
        }
        
        if (parentheses.empty()) {
            return true;
        }
        
        return false;
    }
}