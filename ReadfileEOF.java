package day8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadfileEOF {
    public static void main(String[] args)throws IOException {
        BufferedReader BIN=new BufferedReader(new InputStreamReader(System.in));
        String eachline="";
        int lno=1;
        while(!(eachline=BIN.readLine()).equals("EOF")){
            System.out.println(lno+""+eachline);
            lno++;
        }
        BIN.close();
        
    }
}
