class Solution {
    public static int addDigits(int num) {
        while (num>=10){
            num = sumDigits(num);
        }
        return num;
    }
    public static int sumDigits(int num){
        if (num<10)
            return num;
        else return num%10+sumDigits(num/10);
    }
}