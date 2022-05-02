public class Solution {
    public int countSegments(String s) {
        int res = 0;
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) res++;
        }
        return res;
    }
}
