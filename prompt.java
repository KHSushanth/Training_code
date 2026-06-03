package day5;
import java.io.IOException;
import java.util.Scanner;
public class prompt {
    public static void main(String[] args)throws IOException,InterruptedException {
        Scanner s=new Scanner(System.in);
        Runtime run=Runtime.getRuntime();
        System.out.println("Enter the app:");
        String app=s.next();
        Thread.sleep(5000);
        Process pro=run.exec(app);
        s.close();
    }
    
}
