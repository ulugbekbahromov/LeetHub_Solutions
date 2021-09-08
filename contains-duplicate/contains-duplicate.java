class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        
        if (len == 1 || len == 0) {
            return false;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        return false;
    }
}
