public class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] l = s.toCharArray();
        while(i < j) {
            if(Character.isAlphabetic(l[i]) && Character.isAlphabetic(l[j])) {
                char temp = l[i];
                l[i] = l[j];
                l[j] = temp;
                i++;
                j--;
            } else {
                if(!Character.isAlphabetic(l[i])) {
                    i++;
                }
                if(!Character.isAlphabetic(l[j])) {
                    j--;
                }
            }
        }
        return new String(l);
    }
}
