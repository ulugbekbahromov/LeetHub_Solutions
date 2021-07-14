class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        if (rec1[0] < rec2[2] && rec1[1] < rec2[3]
           && rec2[0] < rec1[2] && rec2[1] < rec1[3]) {
            return true;
        }
        return false;
    }
}


/*
Logic : far points of rec2 should be bigger than of rec1 (a < d)
        close points of rec1 should be gigger than of rec2 (c < b)
                 rec2
                 /
            --------- -> d
            |       |
        ----|---->b |
        |   |   |   |
        |c <----|----
        |       |
   a <- ---------
         
    rec1 /

*/