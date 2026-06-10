package day8;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Fileoutput {
    static File file=new File("logs.doc");
    //public static void writetofile()throws IOException{
    //    DataInputStream dis=new DataInputStream(System.in);
    //    FileOutputStream fos=new FileOutputStream(file);
    //    String each="";
    //    while(!(each=dis.readLine()).equals("EOF")){
    //    fos.write(each.getBytes());
    //}

    //fos.close();
    //dis.close();
//}
    public static String readFromFile()throws IOException{
        FileInputStream fis=new FileInputStream(file);
        String line="";
        int size=fis.available();
        byte[] temp=new byte[size];
        fis.read(temp);
        line=new String(temp);
        fis.close();
        return line;

    }
public static void main(String[] args) throws IOException {
        //writetofile();
        System.out.println( readFromFile());
    }
}





    
    

