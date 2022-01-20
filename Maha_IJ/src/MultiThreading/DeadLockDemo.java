package MultiThreading;

public class DeadLockDemo {
    public static void main(String[] args) {
      final   String resource1="Good Morning";
      final  String resource2="Good Afternoon";
        Thread t1=new Thread() {//Thread t1 tries to lock resource1 then resource2
            public void run() {
                synchronized (resource1) {
                    System.out.println("Now Thread1 is lockec resource1");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                synchronized (resource2) {
                    System.out.println("resource2 also locked by Thread1");
                }
            }
        }
        };
        Thread t2=new Thread(){ //thread t2 tries to lock resource2 and then resource1
            public void run() {
                synchronized (resource2) {
                    System.out.println("Now Thread2 is locked resource2");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                synchronized (resource1) {
                    System.out.println("resource1 is already locked by Thread1");
                }
            }
            }
        };
        t1.start();
        t2.start();
    }
}
