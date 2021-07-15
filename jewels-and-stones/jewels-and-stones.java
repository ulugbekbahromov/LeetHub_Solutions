class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        for (Character jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        
        int numberOfJewels = 0;
        for (Character stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                numberOfJewels++;
            }
        }
        
        return numberOfJewels;
    }
}