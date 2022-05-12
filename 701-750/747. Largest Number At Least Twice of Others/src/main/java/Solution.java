public class Solution {
    public int dominantIndex(int[] nums) {

        int largestIdx = 0;

        for(int i=0; i<nums.length; i++)
            if(nums[i]>nums[largestIdx])
                largestIdx = i;

        boolean dominant = true;

        for(int i=0; i<nums.length; i++)
            if(i!=largestIdx && 2*nums[i]>nums[largestIdx])
                dominant = false;

        return dominant ? largestIdx : -1;
    }
}