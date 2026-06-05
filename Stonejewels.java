package day7;

import java.util.HashSet;
import java.util.Set;

public class Stonejewels {
    public static int findcount(String jw,String st){
        Set<Character> jset=new HashSet<>();
        int count=0;
        for(char each:st.toCharArray()){
            if(jset.contains(each)) count++;

        }
        return count;
    }
    public static void main(String[] args) {
        String jewels="z",stones="ZZ";
        System.out.println(findcount(jewels,stones));
    }
    
}
