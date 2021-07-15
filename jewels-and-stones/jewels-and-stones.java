class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int numberOfJewels = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            
            // if encounters any element of stones in jewels
            if (jewels.indexOf(stones.charAt(i)) > -1) {
                numberOfJewels++;
            }
        }
        
        return numberOfJewels;
    }
}