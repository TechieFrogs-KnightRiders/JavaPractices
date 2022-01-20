package MultiThreading;

public class ReentrantDemo2 extends Thread{
    public synchronized void run(){
        show();
        System.out.println("this is run method ");

    }
    public void show(){
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println("this is show method");
    }

    public static void main(String[] args) {
        ReentrantDemo2 obj1=new ReentrantDemo2();
        ReentrantDemo2 obj2=new ReentrantDemo2();
        obj1.start();
        obj1.interrupt();
        obj2.start();
    }
}
