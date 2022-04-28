public class Solution {

    public void reverseString(char[] s) {
        char[] ch = new char[s.length];
        int count =0;
        for(int i=s.length-1;i>=0;i--){
            ch[count]=s[i];
            count++;
        }
        for(int i=0;i<ch.length;i++){
            s[i]=ch[i];
        }
    }

}
