package day10;

interface Remote<T>{
    int ternary (T data);
}
class Genstore<T> implements Remote<T>{
    T[] pack;
    @Override 
    public int ternary(T data){
        int s=0,e=pack.length;
        while(s<=e){
            int m1=s+(e-s)/3;
            int m2=e-(e-s)/3;
            if(pack[m1].equals(data)){
                System.out.println(m1);return;
            }
            if(pack[m2].equals(data)){
                System.out.println(m2);return;
            }
            String mone=String.valueOf(pack[m1]);
            String mtwo=String.valueOf(pack[m2]);
            String dest=String.valueOf(data);
            if(dest.compareTo(mone)<0)
                e=m1-1;
            else if(dest.compareTo(mtwo)>0)
                s=m2+1;
            else s=m1+1;e=m2-1;
        }

    }
    public static void main(String[] args){
        Genstore<Double> rInt=new Genstore<Double>();
        rInt.pack=new Double[]{7.2,12.3,27.1,91.4,160.1};
        rInt.ternary(160.1);

    }

}
public class Customcollection {
    
}
