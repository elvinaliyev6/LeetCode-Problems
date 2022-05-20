public class Solution {

        public int peakIndexInMountainArray(int[] arr) {
                int max=arr[0];
                int index=0;

                for(int i=1;i<arr.length;i++){
                        if(max<arr[i]){
                                max=arr[i];
                                index=i;
                        }
                }

                return index;
        }

}
