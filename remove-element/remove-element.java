class Solution {
    public int removeElement(int[] nums, int val) {
        int leftElementsNumber = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[leftElementsNumber] = nums[i];
                leftElementsNumber++;
            }
        }
    
        return leftElementsNumber;
    }
}
// Values are not really removed here.