class Solution {
    public boolean isAnagram(String s, String t) {
        
        // edge case when length of strings are not equal
        if (s.length() != t.length()) {
            return false;
        }
        
        if (s.equals("null") || t.equals("null")) {
            return false;
        }
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        return Arrays.equals(sChar, tChar);
    }
}

// O(nlogn) - not optimal solution