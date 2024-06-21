import java.util.Arrays;
class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            char[] sCharArray = new char[s.length()];
            char[] tCharArray = new char[t.length()];
            for (int i=0;i<s.length();i++){
                sCharArray[i] = s.charAt(i);
                tCharArray[i] = t.charAt(i);
            }
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);
            
            for (int i=0;i<sCharArray.length;i++){
                if (sCharArray[i] != tCharArray[i])
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}