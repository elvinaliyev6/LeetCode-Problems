public class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean a = true;
        boolean b = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                a = false;
            } else if (nums[i] > nums[i + 1]) {
                b = false;
            }
        }
        return a || b;
    }
}