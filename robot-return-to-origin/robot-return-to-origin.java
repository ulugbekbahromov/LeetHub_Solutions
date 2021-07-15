class Solution {
    public boolean judgeCircle(String moves) {
        
        // robot is at (0, 0) position
        int x = 0;
        int y = 0;
        
        // loop through elements
        for (char direction : moves.toCharArray()) {
            
            switch (direction) {
                case 'U': y++; break; // up
                case 'D': y--; break; // down
                case 'R': x++; break; // right
                case 'L': x--; break; // left
            }
        }
        
        if (x == 0 && y == 0) { return true; }
        
        return false;
    }
}