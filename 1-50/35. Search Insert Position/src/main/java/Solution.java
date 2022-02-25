public class Solution {

    public static void main(String[] args) {
    int[] nums={1,3,5,6};
    int target=7;
    Solution s=new Solution();
        System.out.println(s.searchInsert(nums,target));


    }

    public int searchInsert(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){
            if(nums[i]>=target) return i;

        }
        return nums.length;
    }
}
