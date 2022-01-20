package MultiThreading;
class TestThread extends Thread{
    public void run(){
        System.out.println("My Jvm is Shutdown");
    }
}
public class ThreadShutdownHook extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("My Thread" + i);
            if (i == 2) {
                try {
                    System.out.println("thread name:"+Thread.currentThread());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
            TestThread tobj=new TestThread();
//            TestThread tobj1=new TestThread();
        Runtime r=Runtime.getRuntime();
        ThreadShutdownHook t1=new ThreadShutdownHook();
        r.addShutdownHook(tobj);
//        r.addShutdownHook(tobj1);
        t1.start();
        try {
            System.out.println("thread name:"+t1.currentThread());
            Thread.sleep(300);
        }catch (InterruptedException e){
            System.out.println(""+e);
        }
        System.out.println("Total Space"+r.totalMemory());
        System.out.println("Free Space in jvm"+r.freeMemory());
            System.gc();
        System.out.println("free Space"+r.freeMemory());

    }
}
