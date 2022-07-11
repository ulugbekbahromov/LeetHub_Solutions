class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        hashNum = {}
        
        for num in nums:
            if num not in hashNum:
                hashNum[num] = 1
            else:
                return True
        
        return False