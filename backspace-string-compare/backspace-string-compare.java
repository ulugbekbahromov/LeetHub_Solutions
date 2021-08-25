class Solution {
    public boolean backspaceCompare(String s, String t) {
        return afterType(s).equals(afterType(t));
    }
    
    private String afterType(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }
        
        return stack.toString();
    }
}