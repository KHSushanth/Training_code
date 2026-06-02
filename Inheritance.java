package day4;
import java.util.Arrays;
class store{
    String[] feedback={};
    public void viewallfeedback(){
        System.out.println(Arrays.toString(feedback));

    }

}
class javabatch extends store{
    String expertname="";
    public javabatch(int size){feedback=new String[size];}
    public void addfeedback(String comments){
        for(int i=0;i<feedback.length;i++)
            if(feedback[i]==null||feedback[i]==""){
                feedback[i]=comments;
                System.out.println("feedback noted");return;
            }
            System.out.println("Buffer is full");
    }
}
class softskillbatch extends store{
    public softskillbatch(){
        feedback=new String[]{"Training is good"};

    }
    public void read(int index){
        if()
    }


}

public class ingeriance {
    public static void main(String[] args){
        javabatch java=new javabatch(2);
        java.expertname="Sushanth";
        java.addfeedback("Expected foundation not advance");
        java.addfeedback("Need more time to write code");
        java.addfeedback("Array quitebdifficult");
        java.viewallfeedback();
        soft.read(9);
        soft.viewallfeedback();
    }
    
}
