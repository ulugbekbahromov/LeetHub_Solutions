class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = nums[0];
        int curSum = maxSum;
        
        if (nums.length == 1)
            return nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i] + curSum, nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}

// Kadane's Algo, O(n)