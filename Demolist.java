package day6;
import java.util.*;

public class Demolist {
    public static void main(String[] args) {
        LinkedList buffer=new LinkedList<>();
        buffer.add("sushanth");
        buffer.add(12);
        buffer.add(false);
        buffer.add("d");
        Queue<String> store=new PriorityQueue<>((a,b)->b.compareTo(a));
        store.offer("spring");
        store.offer("Django");
        System.out.println(store);
        Iterator it=buffer.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
