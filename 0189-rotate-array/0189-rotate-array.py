class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        curr = 0
        nextNum = nums[curr]
        visited = set()
        for i in range(len(nums)):
            if curr in visited:
                curr = (curr + 1) % len(nums)
                nextNum = nums[curr%len(nums)]
            temp = nums[(curr+k) % len(nums)]
            nums[(curr+k) % len(nums)] = nextNum
            visited.add(curr)
            nextNum = temp
            curr = (curr + k) % len(nums)
        
