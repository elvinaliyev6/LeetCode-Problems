import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("aa", "ab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Integer, Character> map = new HashMap<>();
        int i = 0;
        for (char ch : magazine.toCharArray()) {
            map.put(i, ch);
            i++;
        }
        String s = "";

        for (char ch2 : ransomNote.toCharArray()) {
            for (int z = 0; z < i; z++) {
                if (map.get(z) == null)
                    continue;
                if (ch2 == map.get(z)) {
                    s += ch2;
                    map.remove(z);
                    break;
                }
            }
        }

        if (s.length() == ransomNote.length())
            return true;

        return false;

    }
}
