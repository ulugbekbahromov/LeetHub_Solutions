class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder strBuild = new StringBuilder();
        
        for (int i  = words.length-1; i >= 0; i--) {
            if (words[i].length() == 0)
                continue;
            
            if (strBuild.length() > 0)
                strBuild.append(" ");
            
            strBuild.append(words[i]);
        }
        
        return strBuild.toString();
    }
}