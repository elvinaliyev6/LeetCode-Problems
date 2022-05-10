import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        System.out.println(new Solution().arrayPairSum(arr));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, sum = 0;
        while (i < nums.length) {
            sum = sum + nums[i];
            i = i + 2;
        }
        return sum;
    }
}