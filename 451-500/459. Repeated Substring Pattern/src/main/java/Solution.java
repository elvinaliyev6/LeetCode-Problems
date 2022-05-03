public class Solution {

    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        String x=str.substring(1,str.length()-1);

        if(x.contains(s))
            return true;
        return false;
    }

}
