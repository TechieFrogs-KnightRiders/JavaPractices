package MultiThreading;
class Evenodd1{
static int count=1,n=10;
 public synchronized void printEven() {
     while (count < n) {
            while (count % 2 == 0) {
                // System.out.println("Thread 1" + count);
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
               System.out.println(Thread.currentThread().getName() + "  " + count);
                count++;
           notify();
        }
    }
       public synchronized void printOddNub () {
        while (count < n) {
                while (count % 2 == 1) {
                    try {
                       wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+ "  "+ count);
                count++;
                notify();
            }
        }
    }
public class EvenOddSynch {
    public static void main(String[] args) {
final Evenodd1 obj=new Evenodd1();
Thread th1=new Thread(){
    public void run(){
        obj.printEven();
    }
    };
        Thread th2=new Thread(){
            public void run(){
                obj.printOddNub();
            }
        };
        th1.start();
        th2.start();
}
}
