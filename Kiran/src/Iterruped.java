class MyThread extends Thread{
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("Thread"+" "+i);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Got Interrupted");
        }
    }
}
public class Iterruped {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
       // t.interrupt();
        System.out.println("End of the Thread");
    }

    
}
