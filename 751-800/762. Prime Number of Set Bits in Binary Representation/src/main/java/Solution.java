public class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            if(isPrime(Integer.bitCount(i)))
                count++;
        }
        return count;
    }

    // Check for prime
    static boolean isPrime(int num){
        if(num == 1 || num == 0)
            return false;
        for(int i=2; i<= (int)(Math.sqrt(num)); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}