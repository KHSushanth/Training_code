package day9;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.IntStream;
public class FindcharinList {
    public static void main(String[] args){
        String[] words={"Leet","code"};
        char x='e';
        List<Integer> collected=IntStream.range(0,words.length).filter(index->words[index].indexOf(x)!=-1).boxed().collect(Collectors.toList());
        System.out.println(collected);

    }
}
