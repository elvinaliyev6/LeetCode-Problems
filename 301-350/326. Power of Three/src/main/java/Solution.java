public class Solution {

    public boolean isPowerOfThree(int n) {
        int k = n;
        int c = 0;
        while (n > 1) {
            c++;
            n = n / 3;
        }
        if (n == 1 && Math.pow(3, c) == k)
            return true;

        return false;
    }

}
