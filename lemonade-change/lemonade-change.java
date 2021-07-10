class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        // vars for 5, 10, 20
        int five = 0;
        int ten = 0;
        int twenty = 0;
        
        for (int bill : bills) {
            
            switch (bill) {
                // when taking $5, increment five
                case 5:
                    five++;
                    break;
                // when taking $10, increment ten, decrement five
                case 10:
                    if (five-- == 0) return false;
                    ten++;
                    break;
                // when taking $20, increment twenty
                case 20:
                    // if have 5 and 10, give them as a change
                    if (five > 0 && ten > 0) { five--; ten--; }
                    // if have 3 5-dollars, give them all
                    else if (five >= 3) { five -= 3; }
                    else { return false; }
                    twenty++;
            }
            
        }
        return true;
    }
}