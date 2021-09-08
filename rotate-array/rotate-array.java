class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % nums.length;
        
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }
    
    private void reverse(int[] nums, int start, int finish) {
        while (start <= finish) {
            int temp = nums[start];
            nums[start] = nums[finish];
            nums[finish] = temp;
            start++;
            finish--;
        }
    }
}