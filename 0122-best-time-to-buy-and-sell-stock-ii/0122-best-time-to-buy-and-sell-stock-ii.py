from typing import List
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        pricesSorted = sorted(prices)
        profitCounter = 0
        currSellIndex = 0
        for i in range(len(prices)):
            if i >=currSellIndex:
                bestSell = prices[i]
                currIndex = i
                tempProfit = 0
                while True:
                    if currIndex+1 < len(prices) and prices[currIndex+1] >= bestSell:
                        bestSell = prices[currIndex+1]
                        currIndex += 1
                        currSellIndex = currIndex
                        tempProfit = bestSell-prices[i]
                    else:
                        break
                profitCounter += tempProfit
        return profitCounter