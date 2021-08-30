import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        int first;
        int second;
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                first = stack.pop();
                second = stack.pop();
                stack.push(second / first);
            } else if (token.equals("-")) {
                first = stack.pop();
                second = stack.pop();
                stack.push(second - first);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}