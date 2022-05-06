public class Solution {
    //regex
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]*|[A-Z][a-z]+|[a-z]+");
    }

    //with Character
    public boolean detectCapitalUse2(String word) {

        if (word.length() < 2) return true;

        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) return false;
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
}
