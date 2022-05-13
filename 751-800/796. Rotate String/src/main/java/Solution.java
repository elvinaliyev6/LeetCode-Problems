public class Solution {
    public boolean rotateString(String s, String goal) {
        s += s;
        if (s.length()/2==goal.length() && s.contains(goal))
            return true;

        return false;
    }
}
