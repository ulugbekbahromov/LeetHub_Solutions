class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        
        for (int num : nums) {
            curSum = Math.max(num, curSum + num);
            
            if (curSum > maxSum)
                maxSum = curSum;
        }
               
        return maxSum;
    }
}
// Kadane's Algorithm
// O(n)nums - time, O(1) - space