class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int first = 0;
        int last = nums.length - 1;
        int[] result = new int[nums.length];
        
        for (int i = last; i >= 0; i--) {
            
            if (Math.abs(nums[first]) > Math.abs(nums[last])) {
                result[i] = nums[first] * nums[first];
                first++;
            } else {
                result[i] = nums[last] * nums[last];
                last--;
            }
        }
        
        return result;
    }
}