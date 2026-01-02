import java.util.Arrays;
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        char[] c2=s2.toCharArray();
        Arrays.sort(c2);
        
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
}