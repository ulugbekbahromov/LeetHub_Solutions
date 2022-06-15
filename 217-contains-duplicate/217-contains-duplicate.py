class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashNum = {}
        
        for i in nums:
            if i not in hashNum:
                hashNum[i] = 1    
            else:
                return True
            
        return False
    
# solution with hashtable