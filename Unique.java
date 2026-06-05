package day7;
import java.util.HashSet;
import java.util.Set;
class Unique{
    public static int unique(String[] arr){
        String[] codes={};
        Set<String>store=new HashSet<>();
        for(String each:arr){
            StringBuilder build=new StringBuilder();
            for(char ch:each.toCharArray())
                build.append(codes[ch-'a']);
            store.add(build.toString());
        }
        return store.size();
    }
    public static void main(String[] args) {
        String[] arr={"gin","zaz","gig","nsg"};
        System.out.println(unique(arr));
        
    }
}