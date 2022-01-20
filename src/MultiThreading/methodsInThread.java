package MultiThreading;

public class methodsInThread extends Thread{

    @Override
    public void run() {
        System.out.println("My Thread");
    }
    public static void main(String[] args) {
        methodsInThread t1=new methodsInThread();
        methodsInThread t2= new methodsInThread();
        t1.start();
        t2.start();
       // t2.start();// if we r calling same thread again we will get IllegalThreadStateException

        for(int i=0;i<3;i++) {
           // System.out.println(i);
            t2.yield();
            System.out.println(Thread.currentThread().getName()+ "  in control"+i);
        }
    }
}
