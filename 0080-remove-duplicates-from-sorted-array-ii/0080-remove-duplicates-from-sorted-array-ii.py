class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        numsFound = {}
        currMoveAmount = 0
        for i in range(len(nums)):
            curr = nums[i]
            if curr in numsFound and numsFound[curr] > 1:
                currMoveAmount += 1
            else:
                if curr not in numsFound:
                    numsFound[curr] = 1
                else:
                    numsFound[curr] += 1

                if currMoveAmount > 0:
                    nums[i-currMoveAmount] = nums[i]

        return(len(nums)-currMoveAmount)


        