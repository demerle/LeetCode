class Solution:
    def canJump(self, nums: List[int]) -> bool:
        memo = {}
        def traverse(nums, curr, memo):
            if curr == len(nums)-1:
                return True
            if curr in memo:
                return memo[curr]
            if curr < len(nums):
                num = nums[curr]
                while num > 0:
                    if traverse(nums, curr+num, memo):
                        memo[curr] = True
                        return True
                    num -= 1
            memo[curr] = False
            return False

        return traverse(nums, 0, memo)