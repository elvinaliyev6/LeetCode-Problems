public class Main {

    public int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;

            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }

    //recursive
    public int addDigits2(int num) {
        if (num%10 == num) return num;

        int sum = 0;
        while (num>0){
            sum += num%10;
            num/=10;
        }
        return addDigits(sum);
    }
}
