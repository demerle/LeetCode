class Solution {
    public String longestCommonPrefix(String[] strs) {
        String currentLongest = strs[0];
        int lowestLength = 1000;
        for (int i=0;i<strs.length;i++){
            if (strs[i].length() < lowestLength)
                lowestLength = strs[i].length();
        }
        for (int i=0;i<strs.length;i++){
            if (currentLongest.length() < lowestLength)
                lowestLength = currentLongest.length();
            for (int x=0;x<lowestLength;x++){
                if (strs[i].charAt(x) == currentLongest.charAt(x)) {
                    continue;
                }
                else {
                    currentLongest = currentLongest.substring(0, x);
                    break;
                }
            }
        }
        if (currentLongest.length() > lowestLength)
            currentLongest = currentLongest.substring(0,lowestLength);
        return currentLongest;
    }
}