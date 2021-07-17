class Solution {
    public int missingNumber(int[] nums) {
        
        // storing in HashSet
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (Integer num : nums) {
            numbers.add(num);
        }
        
        for (int i = 0; i <= nums.length; i++) {
            // checking if it contains or not
            if (!(numbers.contains(i))) {
                return i;
            }
        }
        
        return -1;
    }
}