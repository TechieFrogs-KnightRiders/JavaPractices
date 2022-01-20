public class ThreadGroupDemo implements Runnable{
    public void run(){
        System.out.println("My running thread");
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1); System.out.println(1);
        
    }

    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("TG1");
        Thread t1 = new Thread(tg1, new ThreadGroupDemo(), "My t1");
        Thread t3 = new Thread(tg1, new ThreadGroupDemo(), "My t3");
        Thread t2 = new Thread(tg1, new ThreadGroupDemo(), "My t2");
        Thread t4 = new Thread(tg1, new ThreadGroupDemo(), "My t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
       // System.out.println("List of threads:");
        tg1.list();
        
       

        //tg1.resume();
        tg1.interrupt();
        System.out.println(tg1.activeCount()+"  "+tg1.getName()+"  "+tg1.getParent());
        
        
    }
}
