class Solution {
    public boolean isValid(String s) {
        
        if (s.equals(null) || s.length() == 0)
            return false;
        
        Stack<Character> parentheses = new Stack<>();
        char[] chArr = s.toCharArray();
        
        for (char ch : chArr) {
            if (ch == '(')
                parentheses.push(')');
            else if (ch == '[')
                parentheses.push(']');
            else if (ch == '{')
                parentheses.push('}');
            else if (parentheses.empty() || parentheses.pop() != ch)
                return false;
        }
        
        return parentheses.empty();
    }
}