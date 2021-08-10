class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1 || nums.length == 0) { return false; }
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        
        return false;
    }
}
// O(nlogn), using Arrays.sort() built-in function