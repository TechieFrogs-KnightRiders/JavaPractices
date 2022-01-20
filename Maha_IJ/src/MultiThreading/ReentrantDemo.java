package MultiThreading;
class ReentrantClass{
    public synchronized void m(){
        n();
        System.out.println("this is m() method");
    }
    public synchronized void n(){
        System.out.println("this in n() method");
    }
}

public class ReentrantDemo {

    public static void main(String[] args) {
        ReentrantClass reobj=new ReentrantClass();
       final Thread t1=new Thread() {
           public void run() {
               reobj.m();// callint method of Reentrant class
           }
       };
            t1.start();
        }
    }

