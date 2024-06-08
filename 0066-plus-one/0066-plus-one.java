class Solution {
    public int[] plusOne(int[] digits) {
        int nineCount = 0;
        while (true){
            int index = digits.length-nineCount-1;
            if (index != -1 && digits[index] == 9){
                nineCount++;
                continue;
            }
            break;
        }
        if (nineCount == 0){
            digits[digits.length-1]++;
            return digits;
        }
        else{
            if (digits.length != nineCount){
                int[] newArray = new int[digits.length+1];
                for (int i = 0;i<nineCount;i++){
                    digits[digits.length-i-1] = 0;
                }
                digits[digits.length-1-nineCount] += 1;
                return digits;
            }
            else{
                int[] newArray = new int[nineCount+1];
                for (int i = 1;i<newArray.length;i++){
                    newArray[i] = 0;
                }
                newArray[0] = 1;
                return newArray;
            }
        }
    }
}
