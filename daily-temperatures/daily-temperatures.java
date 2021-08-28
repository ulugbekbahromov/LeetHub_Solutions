class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] daysCount = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && 
                   temperatures[i] > temperatures[stack.peek()]) {
                int el = stack.pop();
                daysCount[el] = i - el;
            }
            stack.push(i);
        }
        
        return daysCount;
    }
}