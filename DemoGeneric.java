package day10;

import java.util.Arrays;

class Warehouse<T>{
    private T[] data;
    public void setData(T[] data){
        this.data=data;
    }
    public T[] getData(){
        return data;
    }
}
public class DemoGeneric{
    public static void main(String[] args){
        Warehouse<Integer> h1=new Warehouse<Integer>();
        h1.setData(new Integer[]{1,2,3,4,5});
        Warehouse<String> h2=new Warehouse<String>();
        h2.setData(new String[]{"Cog","Wipro"});
        System.out.println(Arrays.toString(h2.getData()));
        System.out.println(Arrays.toString(h1.getData()));
    }
}