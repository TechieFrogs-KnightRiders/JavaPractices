package MultiThreading;

   public class InterruptDemo extends Thread {
       public void run() {
           try {
               Thread.sleep(2000);
               System.out.println("task");
           } catch (InterruptedException e) {
               throw new RuntimeException("Thread Interrupted" + e);//here throwing exception so remaining code will not work
           }
                  }
    public static void main(String[] args) {

        InterruptDemo iobj=new InterruptDemo();


        iobj.start();
        try {
            iobj.interrupt();
        }catch (Exception ie){ System.out.println("Exception handled" +ie);}
    }
}
