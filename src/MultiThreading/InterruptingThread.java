package MultiThreading;

public class InterruptingThread extends Thread {
    public void run(){
        try{
         Thread.sleep(2000);
               System.out.println("task");
     } catch (InterruptedException e) {
        System.out.println("Exception Handled" + e);//here we r handling exception so remaing code will work
        }
        System.out.println("Thread working");
        }

    public static void main(String[] args) {
        InterruptingThread obj=new InterruptingThread();
        obj.start();
        try {
            obj.interrupt();
        }catch (Exception ie){ System.out.println("Exception handled" +ie);}
    }
    }

