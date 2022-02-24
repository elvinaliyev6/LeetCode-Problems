import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
//first way
    public static boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            sum=(sum*10)+x%10;
            x/=10;
        }
        System.out.println(temp+" "+sum);
        if(temp==sum){
            return true;
        }
        return false;


    }

//    second way
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder str = new StringBuilder(s);
        String s2 = String.valueOf(str.reverse());
        if (s.equals(s2))
           return true;
        return false;
    }


}
