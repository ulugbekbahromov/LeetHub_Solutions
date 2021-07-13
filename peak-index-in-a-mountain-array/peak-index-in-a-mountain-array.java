class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peakIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                peakIndex = i;
            }
        }
        
        return peakIndex;
    }
}