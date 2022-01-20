package MultiThreading;

class Tablemul{
   synchronized void print(int n) {
        synchronized (this) {  //Synchronized block
            for (int i = 1; i <= 5; i++)
                System.out.println(n * i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizationAnonymousobj {
    public static void main(String[] args) {
        Tablemul tmobj=new Tablemul();
        Thread t=new Thread(){
            public void run() {
                tmobj.print(6);
            }
        };
        Thread t1=new Thread(){
            public void run(){
                tmobj.print(4);
            }
        };
        t.start();
        t1.start();
    }
}
