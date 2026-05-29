public class stock {
    public static void main(String[] args) {
        int[] stocks={90,40,20,10,4};
        if(stocks.length<2) return;
        int cbuy=stocks[0],csell=stocks[1];
        int mpro=csell-cbuy;
        for(int curr=1;curr<stocks.length;curr++){
            int cpro=stocks[curr]-cbuy;
            if(cpro>mpro){
                mpro=cpro;
                csell=stocks[curr];
            }
            if(stocks[curr]<cbuy) cbuy=stocks[curr];
        }
        System.out.println((csell-mpro)+" "+csell);

        
    }
    
}
