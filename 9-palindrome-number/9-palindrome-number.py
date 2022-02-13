class Solution:
    def isPalindrome(self, x: int) -> bool:
        result = 0
        temp = x
        if x<0 or x%10==0 and x!=0:
            return False
        
        while temp>result:
            result = result*10 + temp%10
            temp //= 10
        
        return temp == result or temp == result//10