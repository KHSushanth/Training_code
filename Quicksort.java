package day10;

import java.util.Arrays;

public class Quicksort {
    public static int findpivot(int[] arr,int start,int end){
        int init=start-1,pdata=arr[end];
        for(int trav=start;trav<end;trav++){
            if(arr[trav]<pdata){
                init++;
                int third=arr[init];
                arr[init]=arr[trav];
                arr[trav]=third;
            }
        }
        int third=arr[init+1];
        arr[init+1]=arr[end];
        arr[end]=third;
        return init+1;
    }
    public static void split(int[] arr,int start,int end){
        if(start<end){
            int pindex=findpivot(arr,start,end);
            split(arr,start,pindex-1);
            split(arr,pindex+1,end);
        }
    }

    public static void main(String[] args){
        int[] arr={4,2,7,12,45};
        split(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    
}
