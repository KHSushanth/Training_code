package day9;
import java.util.*;
import java.util.stream.IntStream;
public class MissingPositive {
    public static void main(String[] args){
        int[] arr={1,2,0};
        Set<Integer> nums=new HashSet<>();
        Arrays.stream(arr).forEach(nums::add);
        int found=IntStream.range(1,Integer.MAX_VALUE).filter(pos->!nums.contains(pos)).
        findFirst().getAsInt();
        System.out.println(found);
    }
    
}
