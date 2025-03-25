class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        charTracker = {}
        second = {}
        for char in s:
            if char not in charTracker:
                charTracker[char] = 1
            else:
                charTracker[char] += 1
        
        for char in t:
            if char not in second:
                second[char] = 1
            else:
                second[char] += 1
        return charTracker == second