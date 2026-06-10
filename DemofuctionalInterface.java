package day9;
interface cosmo{
    void printfizz();
}
public class DemofuctionalInterface {
    static int[] arr={12,10,15,4,9,16};
    public static void main(String[] args){
        cosmo cos=()->{
            for(int each:arr){
                if(each%3==0&&each%5!=0){
                    System.out.println("Fizz");
                }

            }
        };
        cos.printfizz();
    }
}
