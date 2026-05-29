import java.util.*;
public class Mismin {
    public static void main(String[] args) {
        List<Integer> invoices=Arrays.asList(8,10,3,1,4,2,5);
        int min=Collections.min(invoices);
        while(true){
            int current=min+1;
            if(invoices.contains(current)) min=current;
            else{
                System.out.println("Missing "+current);
                return;
            }
        }

    }
    
}
