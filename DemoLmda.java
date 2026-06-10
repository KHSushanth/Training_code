package day9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
class product{
    String itemname;
    int itemprice;
    @Override
    public String toString(){
        return itemname+"="+itemprice+"\n"; 
    }
}

public class DemoLmda {
    public static void pojolambda(){
        product p1=new product();
        p1.itemname="HP";
        p1.itemprice=45000;
        product p2=new product();
        p2.itemname="MAC";
        p2.itemprice=120000;

        product p3=new product();
        p3.itemname="Dell";
        p3.itemprice=61000;
        List<product> items=new ArrayList<>();
        items.add(p1);items.add(p2);items.add(p3);
        Collections.sort(items,(o1,o2)->o1.itemprice-o2.itemprice);
        System.out.println(items);
    }
    public static void main(String[] args){
        List<Integer> alpha=new ArrayList<>();
        alpha.add(34);alpha.add(78);alpha.add(46);alpha.add(12);
        System.out.println(alpha);
        Collections.sort(alpha,(i1,i2)->i2-i1);
        System.out.println(alpha);
        pojolambda();

    }
}
