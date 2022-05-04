import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {


    public static void main(String[] args) {

    }

    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);

        StringBuilder out = new StringBuilder();
        char[] chars = binaryString.toCharArray();
        char x;
        for (char ch : chars) {
            if (ch == '1') {
                x = '0';
            } else {
                x = '1';
            }
            out.append(x);
        }

        return Integer.parseInt(out.toString(),2);
    }

    //second way
    public int findComplement2(int num) {
        String binaryString = Integer.toBinaryString(num);

        String newStr=binaryString.replaceAll("1","-")
                .replaceAll("0","1")
                .replaceAll("-","0");

        return Integer.parseInt(newStr,2);
    }


}
