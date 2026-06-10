package day9;

import java.util.concurrent.Semaphore;

class Fizzbuzz{
    private int n;
    private int current=1;
    private Semaphore sem=new Semaphore(1);
    public Fizzbuzz(int n){this.n=n;}
    public void Fizz(Runnable printFizz){
        try{
            while(true){
                sem.acquire();
                if(current>n){sem.release(); break;}
                if(current%3==0&&current%5!=0){
                    printFizz.run();current++;
                }
                sem.release();
            }
        }catch(InterruptedException i){

        }
    }
}

public class Fizzbuzzdemo {
    public static void main(String[] args){
        Fizzbuzz fb=new Fizzbuzz(15);
        Thread t1=new Thread(()->fb.Fizz(()->System.out.println("fizz")));
        t1.start();
    }
    
}
