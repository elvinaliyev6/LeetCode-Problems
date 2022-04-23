public class Main {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        for (int i : prices) {
            if (minPrice > i) {
                minPrice = i;
            } else {
                max = Math.max(max, i - minPrice);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }

}
