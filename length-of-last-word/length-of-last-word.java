class Solution {
    public int lengthOfLastWord(String s) {
        
        int length = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
        // we start looping from the end    
            
            if (s.charAt(i) != ' ') { 
                // as long as it is not space
                length++;
            } else {
                // it encounters a space character
                if (length > 0) {
                    return length;
                }
            }
        }
        
        return length;
        
    }
}