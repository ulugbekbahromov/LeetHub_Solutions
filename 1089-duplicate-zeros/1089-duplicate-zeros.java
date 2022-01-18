class Solution {
    public void duplicateZeros(int[] arr) {
        
        if (arr.length == 0 || arr == null) {
            return;
        }
        int len = arr.length - 1;
        
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                for (int j = len; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}
// O(1) - space
// O(n^2) - time