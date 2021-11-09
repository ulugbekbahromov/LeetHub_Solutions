class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (sumMap.containsKey(complement)) {
                return new int[] {sumMap.get(complement), i};
            }
            sumMap.put(nums[i], i);
        }
        
        return null;
    }
}
// HashMap, O(n) - time complexity, 