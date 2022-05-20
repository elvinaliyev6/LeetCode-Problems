import java.util.*;

public class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();

        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");

        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i]))
                map.put(arr1[i],1);

            else{
                if(map.get(arr1[i])==-1) continue;
                map.put(arr1[i],-1);
            }

        }

        for(int i=0;i<arr2.length;i++){
            if(!map.containsKey(arr2[i]))
                map.put(arr2[i],1);

            else{
                if(map.get(arr2[i])==-1) continue;
                map.put(arr2[i],-1);
            }
        }

        Set<String> set1=new HashSet<>();
        for(String key:map.keySet()){
            if(map.get(key)==1) set1.add(key);
        }
        String [] res=new String[set1.size()];
        res=set1.toArray(res);
        return res;

    }

}
