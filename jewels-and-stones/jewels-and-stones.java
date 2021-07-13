class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewel = 0;
        
        for (int i = 0; i < stones.length(); i++) { // loop through Stones
            
            if (jewels.indexOf(stones.charAt(i)) > -1) {
                // if char of S occurs in J
                jewel++;
            }
        }
        
        return jewel;
    }
}