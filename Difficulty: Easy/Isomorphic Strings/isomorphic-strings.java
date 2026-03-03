class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        Hashtable<Character, Character> hash = new Hashtable<>(26);
        for(int i = 0;i < s1.length();i++){
            char a = s1.charAt(i), b = s2.charAt(i);
            if(!hash.containsKey(a)){
                if(!hash.containsValue(b))
                    hash.put(a, b);
                else
                    return false;
            }
            else{
                if(hash.get(a) != b)
                    return false;
            }
        }
        return true;
    }
}