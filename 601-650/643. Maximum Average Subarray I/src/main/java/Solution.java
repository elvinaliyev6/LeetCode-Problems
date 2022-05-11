public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // initialize for the max and previous subarray sum
        int max = 0;
        int prev = 0;

        // iterate the first k element as the max and prev value
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }

        prev = max;

        // since we already have the previous value
        // we only need to subtract the the previous value with the element from the last start index
        // and replace it with the new last k value
        for (int i = 1; (i + (k - 1)) < nums.length; i++) {
            // subtract the old start
            prev -= nums[i - 1];
            // add the new last value
            prev += nums[i + (k - 1)];
            if (prev > max) {
                max = prev;
            }
        }

        return  (double) max / (double) k;
    }
}
