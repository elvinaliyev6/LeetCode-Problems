public class Solution {

    // 65A-Z90 a97-z122 ~ ascii
    public String toLowerCase(String s) {
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>=65 && chars[i]<=90){
                chars[i]+=32;
            }
        }
        return new String(chars);
    }


    //second way with toLowerCase method
    public String toLowerCase2(String s) {
        return s.toLowerCase();
    }
}
