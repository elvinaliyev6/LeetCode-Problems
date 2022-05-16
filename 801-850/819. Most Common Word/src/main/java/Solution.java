import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // check corner case
        if (paragraph.length() == 0) return "";
        // make all lower case
        paragraph = paragraph.toLowerCase();
        // remove unnecessary characters
        String noAlphabet = "'!,.;:?";
        // replace all character to empty string
        for (char c : noAlphabet.toCharArray()) {
            paragraph = paragraph.replace(c, ' ');
        }
        // split string for create map
        String[] splstrs = paragraph.split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        for (String s : splstrs) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        // check banned word exists or not
        // If exists remove from map
        for (String s : banned) {
            if (map.containsKey(s.toLowerCase())) {
                map.remove(s.toLowerCase());
            }
        }

        int maxFrequency = 0;
        String maxW = "";
        // check max length and return max length word
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxW = entry.getKey();
            }
        }

        return maxW;
    }
}