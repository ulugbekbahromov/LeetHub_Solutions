class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closing = {")":"(", "}":"{", "]":"["}
        
        if len(s) % 2:
            return False
        
        for p in s:
            if p not in closing:
                stack.append(p)
            else:
                if not stack or stack[-1] != closing[p]:
                    return False
                stack.pop()
                
        return not stack