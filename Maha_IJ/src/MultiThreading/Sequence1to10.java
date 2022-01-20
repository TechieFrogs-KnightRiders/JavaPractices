package MultiThreading;
 class Sequence implements Runnable{
   public int n=10;
   static int count=1;
    int rem;
    static Object obj=new Object();
    Sequence(int remainder){
        rem=remainder;
    }
    public void run(){
        synchronized (obj){
           while(count < n-1){
               while(count%3!=rem){
                   try{
                       obj.wait();
                   }catch (Exception e){
                       e.printStackTrace();
                   }
               }
               System.out.println(Thread.currentThread().getName()+ " "+count);
               count++;
               obj.notifyAll();
           }
        }
    }
}

public class Sequence1to10 {
    public static void main(String[] args) {
        Sequence s1=new Sequence(1);
        Sequence s2=new Sequence(2);
        Sequence s3=new Sequence(0);
        Thread t1=new Thread(s1,"Thread-1");
        Thread t2=new Thread(s2,"Thread-2");
        Thread t3=new Thread(s3,"Thread-3");
        t1.start();
        t2.start();
        t3.start();

    }
}
