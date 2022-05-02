import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
                temp++;
                if (temp == 3)
                    return nums[i];
            }
        }
        return list.get(0);
    }
}
