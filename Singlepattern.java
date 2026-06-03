package day5;

public class Singlepattern {
    public static void main(String[] args) {
        KYC kyc=KYC.getKyc();
        kyc.name="Sushanth";
        kyc.contact=8437827738L;
    }
    
}
class KYC{
    String name;
    long contact;
    private static KYC kyc=new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){};
}
