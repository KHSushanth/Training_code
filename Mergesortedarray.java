package day4;

public class Mergesortarray {
    public static void main(String[] args) {
        int[] alpha={1,4,6,0,0};
        int m=3,n=2;
        int[]beta={2,5};
        int l=m-1,r=n-1,pos=m+n-1;
        while(l>=0&&r>=0){
            if(alpha[l]>beta[r]) alpha[pos--]=alpha[l--];
            else alpha[pos--]=beta[r--];
        }
        
    }
    
}
