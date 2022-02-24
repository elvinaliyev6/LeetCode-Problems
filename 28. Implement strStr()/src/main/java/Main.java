public class Main {

    public static void main(String[] args) {
        String haystack="hello",needle="ll";
        Main m=new Main();
        System.out.println(m.strStr(haystack,needle));;

    }

    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() && needle.isEmpty() )
            return 0;
        else if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}
