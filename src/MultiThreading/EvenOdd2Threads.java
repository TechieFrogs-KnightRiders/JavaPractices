package MultiThreading;
class EvenOdd {
    int count=1,n=10;

    public void evenprint() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +count);
                count++;
                notify();
            }
        }
    }

    public void oddprint() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +count);
                count++;
                notify();
            }
        }
    }
}

public class EvenOdd2Threads {
    public static void main(String[] args) {

        EvenOdd ed=new EvenOdd();
         Thread t1=new Thread(){
             public void run() {
                 ed.evenprint();
             }
        };
        Thread t2=new Thread(){
            public void run() {
                ed.oddprint();
            }
        };
        t1.setName("Even nub");
        t2.setName("Odd Nub");
    t1.start();
    t2.start();

    }
}
