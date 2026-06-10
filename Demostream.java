package day9;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
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

public class Demostream {
    public static void streampojo(){
        List<product> items=Arrays.asList(new product("ssd",56000),
        new product("spendrive",800),
        new product("safari trolly",2880)
    );
    List<String> names=items.stream().map(product::getItemname).collect(Collectors.toList());
    System.out.println(names);
    }
    public static void main(String[] args){
    //     List<Double> bmis=Arrays.asList(21.5,18.6,31.7,29.6,15.8,23.5);
    //     List<Double> underweight=bmis.stream().filter(each->each<=18.5).collect(Collectors.toList());
    //     Sstem.out.println(underweight);
    // }
    streampojo();
    }
    
}
