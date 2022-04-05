public class Solution {
    public int[] plusOne(int[] digits) {
        int shift = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int newDigit = digits[i] + shift;
            digits[i] = newDigit % 10;
            shift = newDigit / 10;
        }

        if (shift > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = shift;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }

            return newDigits;
        }

        return digits;
    }
}
