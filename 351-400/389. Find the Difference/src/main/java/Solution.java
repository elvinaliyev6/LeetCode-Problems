public class Solution {

    public static void main(String[] args) {

    }

    public char findTheDifference(String s, String t) {

        int sum1 = 0, sum2 = 0;

        for(int i= 0; i<Math.max(s.length(),t.length()); i++){

            if(i<s.length())
                sum1 += s.charAt(i);
            if(i<t.length())
                sum2 += t.charAt(i);
        }

        return (char)((sum2-sum1));

    }
}
