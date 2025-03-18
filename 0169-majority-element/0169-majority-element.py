class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        d = {}
        currMaxNum = 0
        currMaxIndex = -1
        for item in nums:
            if item not in d:
                d[item] = 1
                if currMaxNum == 0:
                    currMaxNum = 1
                    currMaxIndex = item
            else:
                d[item] += 1
                if d[item] > currMaxNum:
                    currMaxNum = d[item]
                    currMaxIndex = item
        return currMaxIndex    
        