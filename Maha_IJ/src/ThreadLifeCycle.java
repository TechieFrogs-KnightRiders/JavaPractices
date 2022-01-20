public class ThreadLifeCycle extends Thread{
    public void run(){
        System.out.println("The Run Thread");
        try{
           Thread.sleep(5000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ThreadLifeCycle obj=new ThreadLifeCycle();
        Thread t=new Thread("mmm");
        Thread th1=new Thread(obj);
        ThreadLifeCycle th2=new ThreadLifeCycle();
        ThreadLifeCycle th3=new ThreadLifeCycle();

        System.out.println(th1.getState());
        th1.start();
       System.out.println(th1.getState());
        obj.start();
        System.out.println(obj.isAlive());//isAlive method will check the thread is alive or not returns boolean value

        //th1.interrupt();
        System.out.println(th1.isInterrupted());//isInterrupted method returns true or false

        try
        {
            System.out.println("Current Thread: "
                    + t.currentThread().getName());
            th1.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
        // th2 starts
        System.out.println(currentThread()+ "At present thread");
       System.out.println(th1.isAlive());
        th2.start();

        try
        {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            th3.join();//it will put current thread on wait until the thread which it is called is dead
            th2.yield();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                    "been caught" + ex);
        }
        // th3 starts
        th3.start();
        //th1.suspend();//these methods r deprecated ones
      //  th2.resume();
        //th3.stop();

    }
}
