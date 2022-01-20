package MultiThreading;
class Multiplication{
    synchronized static void printMul(int n){
        for(int i=1;i<=5;i++) {
            System.out.println(n * i);
        }
        try{
            Thread.sleep(3000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
class StaticThread extends Thread{
    public void run(){
        Multiplication.printMul(20);
    }
}
class StaticThread1 extends Thread{
    public void run(){
        Multiplication.printMul(30);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        StaticThread s1=new StaticThread();
        StaticThread1 s2=new StaticThread1();
        s1.start();
        s2.start();
    }
}
