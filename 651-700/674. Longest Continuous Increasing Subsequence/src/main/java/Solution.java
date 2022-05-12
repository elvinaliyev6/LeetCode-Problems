public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLenghth = 1;

        int incr = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                incr++;
                maxLenghth=Math.max(maxLenghth, incr);
            } else {
                incr = 1;
            }
        }
        return maxLenghth;
    }
}
