public class MajorityElement {

    public int majorityElement(int[] nums) {
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }

        }

        return nums[index];
    }

}
