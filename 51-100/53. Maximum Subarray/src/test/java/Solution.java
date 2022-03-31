public class Solution {
    public static void main(String[] args) {
        
    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum = Math.max(nums[i],sum + nums[i]);
            max = Math.max(max,sum);
        }

        return max;
    }

}
