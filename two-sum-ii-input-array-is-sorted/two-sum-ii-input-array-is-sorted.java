class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indexArr = new int[2];
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                indexArr[0] = ++left;
                indexArr[1] = ++right;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }   
        }
        
        return indexArr;
    }
}
// Two-pointer approach
// Time Complexity - O(n)
// Space Complexity - O(1)