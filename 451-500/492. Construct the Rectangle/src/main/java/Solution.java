public class Solution {
    public int[] constructRectangle(int area) {

        int res = (int) Math.sqrt(area);

        while (area % res != 0)
            res--;

        int[] arr = {area / res, res};
        return arr;
    }
}
