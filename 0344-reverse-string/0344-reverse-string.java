class Solution {
    public void reverseString(char[] s) {
        char[] copy = new char[s.length];
        for (int i=0; i<s.length; i++){
            copy[i] = s[i];
        }
        for (int i=0; i<s.length; i++){
            s[i] = copy[s.length-i-1];
        }
    }
}