package day9;
import java.util.*;
class product{
    String itemname;
    int itemprice;
    product(String t,int i){
        this.itemname=t;
        this.itemprice=i;
    }
    @Override
    public String toString(){
        return itemname+"="+itemprice+"\n"; 
    }
    public String getItemname() {
        return itemname;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public int getItemprice() {
        return itemprice;
    }
    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }
}

public class Demomethodref {
    public static void pojorefer(){
        List<product> items=Arrays.asList(new product("ssd",56000),
        new product("pendrive",800));
        items.forEach(System.out::println);
        items.sort(Comparator.comparing(product::getItemname));
        items.forEach(System.out::println);
    }
    public static void main(String[] args){
        List<String> skills=Arrays.asList("sprig","Django","Cypress","Jinja");
        skills.sort(String::compareTo);
        skills.forEach(System.out::println);
        pojorefer();
        
    }
     
    
}
