class Solution {
    public void reverseString(char[] s) {
        
        int firstElemIndex = 0;
        int lastElemIndex = s.length - 1;
        
        while (firstElemIndex <= lastElemIndex) {
            char temp = s[lastElemIndex];
            s[lastElemIndex] = s[firstElemIndex];
            s[firstElemIndex] = temp;
            
            firstElemIndex++;
            lastElemIndex--;
        }
    }
}