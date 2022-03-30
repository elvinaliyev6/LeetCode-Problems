

class Solution {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);;
    }

    public int divide(int dividend, int divisor) {
        if((dividend/divisor <= Integer.MIN_VALUE) && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return dividend/divisor;
    }
}
