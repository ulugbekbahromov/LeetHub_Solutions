class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        char[] ch = s.toCharArray();
        
        for (int i = 0, j = 1; j <= len; j++) {
            if (j == len || ch[j] == ' ') {
                reverse(ch, i, j-1);
                i = j + 1;
            }
        }
        return new String(ch);
    }
    
    public void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            
            left++;
            right--;
        }
    }
}