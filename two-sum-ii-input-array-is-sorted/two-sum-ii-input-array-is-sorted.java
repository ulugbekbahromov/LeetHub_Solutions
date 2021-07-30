class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] newNums = new int[2];
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                newNums[0] = left + 1;
                newNums[1] = right + 1;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return newNums;
    }
}
// Two-pointer approach