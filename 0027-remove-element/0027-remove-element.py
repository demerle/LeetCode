class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        popCount = 0
        for i in range(len(nums)):
            if i-popCount < len(nums) and nums[i-popCount] == val:
                nums.pop(i-popCount)
                popCount += 1
        return len(nums)
        