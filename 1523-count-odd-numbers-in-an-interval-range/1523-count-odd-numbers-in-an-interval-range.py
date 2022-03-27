class Solution:
    def countOdds(self, low: int, high: int) -> int:
        if low % 2 == 0 and high % 2 == 0:
            return int((high - low) / 2)
        return int((high - low) / 2 + 1);
    # O(1) - time and O(1) - space