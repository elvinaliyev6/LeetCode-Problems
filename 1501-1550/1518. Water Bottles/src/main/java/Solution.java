public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        int rem=0;
        int reamins=0;
        while(numBottles>=numExchange){

            if(numBottles%numExchange>0){
                rem=numBottles%numExchange;
            }
            numBottles=numBottles/numExchange;
            res+=numBottles;
            numBottles+=rem;
            rem=0;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWaterBottles(15,4));
    }
}
