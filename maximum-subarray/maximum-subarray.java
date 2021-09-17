class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = maxSum;
        
        for (int i = 1; i < nums.length; i++) {
            if (curSum < 0) {
                curSum = nums[i];
            } else {
                curSum += nums[i];
            }
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}

// Kadane's Algo, O(n)