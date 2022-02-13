class Solution:
    def isPalindrome(self, x: int) -> bool:
        result = ""
        temp = str(x)
        if x<0:
            return False
        elif x == 0 or x<10:
            return True
        
        for i in range(len(temp)//2):
            if temp[i] != temp[-i-1]:
                return False
        
        return True
        