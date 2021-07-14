class Solution {
    public boolean isPalindrome(String s) {
        // some string var
        String str = "";
        
        for (char c : s.toCharArray()) {
            // as long as it is char or digit, should add it to str
            if (Character.isDigit(c) || Character.isLetter(c)) {
                str += c;
            }
        }
        
        str = str.toLowerCase();
        
        int first_index = 0;
        int last_index = str.length() - 1;
        
        while (first_index <= last_index) {
            
            if (str.charAt(first_index) != str.charAt(last_index)) {
                return false;
            }
            
            first_index++;
            last_index--;
        }
        
        return true;
    }
}