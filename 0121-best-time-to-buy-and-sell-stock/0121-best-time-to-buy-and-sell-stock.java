class Solution {
    public static int maxProfit(int[] prices) {
        int bestGap = 0;
        int relMin = 10000;
        int relMax = 0;
        int relMinLoc = 0;
        int relMaxLoc = 0;
        for (int i = 0;i<prices.length;i++){
            if (prices[i] < relMin) {
                relMinLoc = i;
                relMin = prices[i];
            }
            if (prices[i] > relMax) {
                relMaxLoc = i;
                relMax = prices[i];
            }
            if (relMinLoc<relMaxLoc) {
                if (relMax-relMin > bestGap) {
                    bestGap = relMax - relMin;
                }
            }
            else {
                relMax = 0;
            }
        }
        return bestGap;
    }
}