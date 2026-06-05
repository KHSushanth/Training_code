package day6;
import java.util.Arrays;
public class LIS1 {
    public static int findlength(int[] arr){
        int size=arr.length,mlength=1;
        int[] dp=new int[size];
        Arrays.fill(dp,1);
        for(int i=1;i<size;i++){
            for(int comp=0;comp<i;comp++){
                if(arr[i]>arr[comp])
                    dp[i]=Math.max(dp[i],dp[comp]+1);
            }
            mlength=Math.max(mlength,dp[i]);
        }
        return mlength;

    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,3,4};
        System.out.println(findlength(arr));
    }
    
}
