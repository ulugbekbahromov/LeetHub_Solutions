class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // vars for sum and max element
        int sum = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(nums[i] == 0){
                sum = 0; // when encounters zero, set sum zero too
            } else {
                max = Math.max(max, sum); // setting value to max
            }
        }
        
        return max;
    }
}