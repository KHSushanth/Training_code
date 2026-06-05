package day6;
import java.util.Stack;
public class Largesthitogram {
    public static int Maxarea(int[] chart){
        int maxarea=Integer.MAX_VALUE,temp=0;
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<=chart.length;i++){
            int cvalue=(i==chart.length)?0:chart[i];
            while(!stk.isEmpty()&&cvalue<chart[stk.peek()]){
                int len=chart[stk.pop()];
                int brd =stk.isEmpty()?i:i-stk.peek()-1;
                temp=len*brd;
                maxarea=Math.max(temp,maxarea);

            }
        }
        return maxarea;

    }
    public static void main(String[] args) {
        int[] chart={2,4};
        System.out.println(Maxarea(chart));

        
    
}
}
    

