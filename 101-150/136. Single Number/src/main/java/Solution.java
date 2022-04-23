import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 2, 1};

        System.out.println(singleNumber(arr));


    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1)
                return nums[i];

            else if (nums[i] != nums[i + 1]) {
                return nums[i];
            }

        }
        return 0;
    }

}
