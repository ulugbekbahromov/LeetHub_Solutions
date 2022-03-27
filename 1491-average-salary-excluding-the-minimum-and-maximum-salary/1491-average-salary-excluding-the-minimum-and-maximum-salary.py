class Solution:
    def average(self, salary: List[int]) -> float:
        mini, maxi, total = math.inf, -math.inf, 0.0
        
        for sal in salary:
            mini, maxi = min(mini, sal), max(maxi, sal)
            total += sal
        
        return (total - mini - maxi) / (len(salary) - 2)
    # O(n) - time, O(1) - space