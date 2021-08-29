class Solution {
    public boolean isAnagram(String s, String t) {
        
        // edge case when length of strings are not equal
        if (s.length() != t.length()) {
            return false;
        }
        
        if (s.equals("null") || t.equals("null")) {
            return false;
        }
        
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }
        
        for (int letter : alphabet) {
            if (letter != 0) {
                return false;
            }
        }
        return true;
    }
}

// O(nlogn) - not optimal solution