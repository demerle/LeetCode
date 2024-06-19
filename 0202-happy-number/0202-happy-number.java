class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7)
            return true;
        if (n != 1 && n/10 == 0)
            return false;
        int[] digits = splitDigits(n);
        int total = 0;
        for (int i : digits){
            total += (i*i);
        }
        return isHappy(total);
    }
    public int[] splitDigits(int num) {
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
}