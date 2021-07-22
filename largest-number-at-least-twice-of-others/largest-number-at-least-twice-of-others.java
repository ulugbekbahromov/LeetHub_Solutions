class Solution {
    public int dominantIndex(int[] nums) {
        
        int firstMax = 0;
        int secondMax = 0;
        int index = -1;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        
        return secondMax * 2 <= firstMax ? index : -1;
    }
}