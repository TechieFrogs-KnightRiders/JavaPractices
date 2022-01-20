package MultiThreading;

public class ThreadPoolDemo implements Runnable{
    private String s;
    public ThreadPoolDemo(String Name){
        s=Name;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" Start message "+s);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End");
    }

}
