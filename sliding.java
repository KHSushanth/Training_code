package day6;
public class sliding{
    public static int[] maxelement(int[] arr,int k){

        int max=arr[0];
        int[] res=new int[arr.length];
        for(int i=0;i<k;i++){
            max=Math.max(max,arr[i]);
            res[i]=max;
        }
        for(int i=k;i<arr.length;i++){
            max=Math.max(max,arr[i]-arr[i-k]);
            res[i]=max;
            
    
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(maxelement(arr,k));
    }
}