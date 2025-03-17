class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        setNums = list(dict.fromkeys(nums))
        for i in range(len(setNums)):
            nums[i] = setNums[i]
        return len(setNums)