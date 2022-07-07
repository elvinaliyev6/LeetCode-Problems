import java.util.Stack;

public class Solution {
    public String makeGood(String s) {
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.isEmpty()) {
                list.push(s.charAt(i));
            } else if (Math.abs((int) list.peek() - (int) s.charAt(i)) == 32) {
                list.pop();
            } else {
                list.push(s.charAt(i));
            }
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
        }
        return str;
    }
}
