public class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while(start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return (checkPalindrome(s, start + 1, end) || checkPalindrome(s, start, end - 1));
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean checkPalindrome(String str, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if (str.charAt(startIndex) != str.charAt(endIndex)) return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
