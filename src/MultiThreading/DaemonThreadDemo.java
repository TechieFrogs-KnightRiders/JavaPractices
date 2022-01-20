package MultiThreading;

public class DaemonThreadDemo extends Thread {
    public void run() {
        System.out.println("My Thread" );

        if(Thread.currentThread().isDaemon()){
            System.out.println("This is Daemon Thread");
        }else
            System.out.println("Not Daemon Thread");
    }
    public static void main(String[] args) {
        DaemonThreadDemo d1 = new DaemonThreadDemo();
        DaemonThreadDemo d2 = new DaemonThreadDemo();
        d1.setDaemon(true);// if true this Thread make Daemon Thread
        d1.start();
        d2.start();
        d1.setDaemon(false);//once start() the thread we can not change setDeamon() for those threads
       d1.start();//IllegalThreadStateException will come

    }
}
