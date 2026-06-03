package day5;
import java.util.Arrays;
class Countoverlap{
    public static int overlap(int[][] slots){
        if(slots.length==0) return 0;
        Arrays.sort(slots,(r1,r2)->r1[1]-r2[1]);
        int count=0,pend=slots[0][1];
        for(int i=1;i<slots.length;i++)
            if(slots[i][0]<pend)count++;
            else pend=slots[i][1];
        return count;    
    }
    public static void main(String[] args) {
        int[][] slots={{1,2},{2,3},{2,4},{3,5}};
        System.out.println(overlap(slots));
    }
}