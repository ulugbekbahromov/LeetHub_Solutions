class Solution {
    public int maximumProduct(int[] nums) {
        
        int len = nums.length;
        Arrays.sort(nums);
        
        int product1 = nums[len - 3] * nums[len - 2] * nums[len - 1];
        int product2 = nums[0] * nums[1] * nums[len - 1];
        
        return product1 < product2 ? product2 : product1;
    }
}