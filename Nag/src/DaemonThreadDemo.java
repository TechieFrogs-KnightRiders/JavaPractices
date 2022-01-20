public class DaemonThreadDemo extends Thread{
    public void run(){
        System.out.println("My thread running "+Thread.currentThread().isDaemon());
    }
    public static void main(String[] args) {
        DaemonThreadDemo d1 = new DaemonThreadDemo();
        DaemonThreadDemo d2 = new DaemonThreadDemo();
        DaemonThreadDemo d3 = new DaemonThreadDemo();

        d1.setDaemon(true); // d1 thread as daemon thread

        d1.start();
        d2.start(); // user threads
        d3.start(); // user threads

        d1.setDaemon(false); // d1 to user thread

       // d1.start();




    }
}
