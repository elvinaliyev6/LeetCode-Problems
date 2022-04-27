import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
    }

    public void moveZeroes2(int[] nums) {
        Stack<Integer> zero = new Stack<>();
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero.push(nums[i]);
            } else {
                val.push(nums[i]);
            }
        }

        int i = nums.length - 1;
        while (zero.size() > 0) {
            nums[i] = zero.pop();
            i--;
        }
        while (val.size() > 0) {
            nums[i] = val.pop();
            i--;
        }

    }
}

