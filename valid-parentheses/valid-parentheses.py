class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        parenthesis = {")":"(", "}":"{", "]":"["}
        
        for p in s:
            if p in parenthesis:
                if stack and stack[-1] == parenthesis[p]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(p)
                
        return True if not stack else False