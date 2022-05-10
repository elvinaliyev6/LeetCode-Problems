public class Solution {

    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num *= -1;
        }

        String ans = "";
        while (num > 0) {
            int rem = num % 7;
            ans = rem + ans;
            num /= 7;
        }

        if (isNegative) ans = "-" + ans;
        return ans;
    }

}
