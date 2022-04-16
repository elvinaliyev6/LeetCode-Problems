import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {2,2,1};

        Solution solution=new Solution();
        System.out.println(solution.singleNumber(arr));

    }

    public int singleNumber(int[] nums) {

        int result = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if(i==nums.length-1) {
                result=nums[i];
            }else if(nums[i]!=nums[i+1]){
                result=nums[i];
            }

        }
        return result;
    }

}
