public class Solution {

    public boolean isPowerOfFour(int n) {
        int k = n;
        int c = 0;
        while (n > 1) {
            c++;
            n = n / 4;
        }
        if (n == 1 && Math.pow(4, c) == k)
            return true;

        return false;
    }

}
