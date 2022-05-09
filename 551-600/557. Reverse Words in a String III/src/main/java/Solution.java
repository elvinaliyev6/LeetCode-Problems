public class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(String str: arr){
            for(int i=str.length()-1;i>=0;i--){
                stringBuilder.append(str.charAt(i));
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
