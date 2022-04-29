public class Solution {

    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int z = 0; z < s.length(); z++) {
                if (i!=z && s.charAt(i) == s.charAt(z)) {
                    count++;
                    break;
                }
            }
            if (count == 0) return i;
            else count = 0;
        }
        return -1;
    }


}
