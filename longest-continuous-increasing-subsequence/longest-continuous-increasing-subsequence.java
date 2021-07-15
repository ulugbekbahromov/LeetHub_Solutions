class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int result = 1;
        int sequence = 1;
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i - 1] < nums[i]) {
                sequence++;
            } else {
                sequence = 1;
            }
            result = Math.max(result, sequence);
        }
        
        return result;
    }
}
