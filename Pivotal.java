package day3;

import java.util.Arrays;

public class Pivotal {
    public static void main(String[] args) {
        
        int[] alpha = {2,1,-1};
        int preSum = 0, postSum = 0, size = alpha.length;
        for(int index = 0; index<size; index++){
            int[] subArray = Arrays.copyOfRange(alpha,index+1,size);
            postSum = Arrays.stream(subArray).sum();
            if(preSum == postSum){
                System.out.println(index);
                break;
            }
            preSum += alpha[index];
        }
    }
}