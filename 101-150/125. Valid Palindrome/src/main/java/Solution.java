public class Solution {

    public static void main(String[] args) {

    }

    //Solution first way
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase();

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    //Solution second way
    public boolean isPalindrome2(String s) {
        s = s.replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase();

        s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        builder.append(s);

        return builder.toString().equals(builder.reverse().toString());
    }
}
