class Solution:
    def fib(self, n: int) -> int:
        if n < 0:
            return -1
        if n == 0:
            return 0
        curr = 1
        prev = 0
        for i in range(n-1):
            temp = prev
            prev = curr
            curr = curr+temp
        return curr
            