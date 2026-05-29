import java.util.*;
public class Colors12 {

    public static void sort(int[] t) {

        int l = 0;
        int trav = 0;
        int end = t.length - 1;

        while (trav <= end) {

            if (t[trav] == 0) {

                
                int temp = t[trav];
                t[trav] = t[l];
                t[l] = temp;

                l++;
                trav++;

            } 
            else if (t[trav] == 1) {
                trav++;
            } 
            else {

                
                int temp = t[trav];
                t[trav] = t[end];
                t[end] = temp;

                end--;
            }
        }

        System.out.println(Arrays.toString(t));
    }

    public static void main(String[] args) {

        sort(new int[]{2,0,0,1,0,2,0,1});
    }
}