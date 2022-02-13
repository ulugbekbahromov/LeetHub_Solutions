class Solution:
    def isPalindrome(self, x: int) -> bool:
        result = ""
        temp = x
        if x<0:
            return False
        elif x == 0:
            return True
        
        while x > 0:
            result += str(x%10)
            x = x//10
        
        return result == str(temp)