class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;
        
        for (Integer num : nums) {
            
            if (num.equals(max) || num.equals(second_max) || num.equals(third_max)) {
                continue;
            }
            
            if (max == null || max < num) {
                third_max = second_max;
                second_max = max;
                max =  num;
            } else if (second_max == null || second_max < num) {
                third_max = second_max;
                second_max = num;
            } else if (third_max == null || third_max < num) {
                third_max = num;
            }
        }
        
        return third_max == null ? max : third_max;
    }
}