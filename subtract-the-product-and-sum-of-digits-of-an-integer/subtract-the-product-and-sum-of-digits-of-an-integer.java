class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;        // var for sum of digits
        int product = 1;    // var for product of digits
        
        while (n > 0) {
            
            // taking last digit every time 
            int lastDigit = n % 10;
            sum += lastDigit;       // collecting to sum
            product *= lastDigit;   // collecting to product
            n /= 10; // 1000 -> 100 -> 10 -> 1
        }
        
        int result = product - sum;
        return result;
    }
}