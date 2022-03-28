package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;

        Solution s=new Solution();
        System.out.println(s.searchRange(nums,target));;
    }

    public int[] searchRange(int[] nums, int target) {
        List<Integer> list =new ArrayList<>();
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
                break;
            }
        }

        for(int j=nums.length-1;j>=0;j--){
                if(nums[j]==target){
                    list.add(j);
                    break;
            }
        }

    if(list.size()!=2){
        List<Integer> list2=new ArrayList<>();
        list2.add(-1);
        list2.add(-1);
        int[] result=list2.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }

    return  list.stream()
            .mapToInt(Integer::intValue)
            .toArray();

    }

}
