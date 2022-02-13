class Solution:
    def isPalindrome(self, x: int) -> bool:
        result = 0
        temp = x
        if x<0:
            return False
        elif x == 0 or x<10:
            return True
        
        while temp>0:
            result = result*10 + temp%10
            temp //= 10
            print(result, " ", temp)
        
        return result == x