package day4;

import java.util.Arrays;

public class prefix {
    public static void prefixsum(int[] og,int[] prefix,int index){
        if(index==0){
        prefix[0]=og[0];
        return;
        }
        prefixsum(og,prefix,index-1);
        prefix[index]=prefix[index-1]+og[index];
    }
    public static void post(int[] og,int[] postfix,int index){
        if(index==og.length-1){
            postfix[index]=og[index];
            return;
        }
        post(og,postfix,index+1);
        postfix[index]=postfix[index+1]+og[index];
    }
    public static void main(String[] args) {
        int[] arr={23,12,98,45,18,45,12,98};
        int[]sumpre=new int[arr.length];
        int[]sumpost=new int[arr.length];
        prefixsum(arr,sumpre,arr.length-1);
        System.out.println(Arrays.toString(sumpre));
        prefixsum(arr,sumpost,0);
        System.out.println(Arrays.toString(sumpost));

        
    }
    
}
