package com.company.main;

public class Solution {

    public int smallestRangeI(int[] nums, int k) {
        if(nums.length==1){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int e : nums){
            if(e>max){
                max=e;
            }
            if(e<min){
                min=e;
            }
        }
        if((max-min-2*k)<0){
            return 0;
        }
        return max-min-2*k;
    }

}
