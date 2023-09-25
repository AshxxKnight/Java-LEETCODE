//389
class Solution {
    public char findTheDifference(String s, String t) {
        char ch = 0;
        for(char cs: s.toCharArray())
            ch ^= cs;
        for(char ct: t.toCharArray())
            ch ^= ct;
        
        return ch;
    }
}