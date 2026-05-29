import java.util.*;
public class movezero {
    public static void move(int[] t){
        int v=0,tr=0,size=t.length;
        while(tr<size){
            if(t[tr]!=0){
                t[v]=t[tr];
                v++;
            }
            tr++;
        }
        for(int i=v;i<size;i++){
            t[i]=0;
        }
        System.out.println(Arrays.toString(t));
    }
    public static void main(String[] args) {
        move(new int[]{1,0,2,0,3,6});
        
    }
    
}
